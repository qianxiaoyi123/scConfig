package multipledatasources.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**生成压缩文件
 * Created by zhangmingyu on 2019/11/13.
 */
@Component
public class Zip {
    private final Logger log=LoggerFactory.getLogger(this.getClass());
//    public  boolean toZip(String srcDir, String targetDir, String zipName, boolean encrypt, String password){
//        try {
//            ZipFile zipFile = new ZipFile(targetDir+zipName);
//            File src = new File(srcDir);
//            File[] srcFiles = src.listFiles();
//            if (srcFiles == null || srcFiles.length < 1) {
//                log.error(srcDir + "目录下没有文件");
//                return false;
//            }
//            ArrayList<File> files = new ArrayList<>(Arrays.asList(srcFiles));
//            ZipParameters parameters = new ZipParameters();
//            parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);//压缩方法
//            parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_ULTRA);//压缩级别
//            parameters.setEncryptFiles(encrypt);//是否加密
//            parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_AES);//加密方式
//            parameters.setAesKeyStrength(Zip4jConstants.AES_STRENGTH_256);//加密强度
//            parameters.setPassword(password);
//            zipFile.addFiles(files,parameters);
//
//        } catch (ZipException e) {
//            e.printStackTrace();
//        }
//        return true;
//    }

    /**
     *压缩文件夹到指定目录 (jdk)
     * @param srcDir 压缩文件夹
     * @param targetDir 压缩文件存放目录
     * @param zipName 压缩文件名字
     * @return
     */
    public  boolean toZip(String srcDir,String targetDir,String zipName){
        File  src = new File(srcDir);
        if( !src.exists()  ){
            src.mkdirs();
        }
        File[] srcFiles = src.listFiles();
        if( srcFiles == null || srcFiles.length < 1 ){
            log.error(srcDir+"目录下没有文件");
            return false ;
        }
        File zipFile = new File(targetDir + zipName );
        if( !zipFile.exists() ){
            try {
                zipFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                log.error(targetDir + zipName + ".zip创建失败");
                return false;
            }
        }
        FileOutputStream fos = null;
        ZipOutputStream zos = null;
        FileInputStream fis = null;
        BufferedInputStream bis = null;

        try {
            fos = new FileOutputStream(zipFile);
            zos = new ZipOutputStream(new BufferedOutputStream(fos));
            byte[] bufs = new byte[1024 * 8];
            for (int i = 0; i < srcFiles.length; i++) {
                ZipEntry zipEntry = new ZipEntry(srcFiles[i].getName());
                zos.putNextEntry(zipEntry);
                fis = new FileInputStream(srcFiles[i]);
                bis = new BufferedInputStream(fis, 1024 * 8);
                int read = 0;
                while ((read = bis.read(bufs, 0, 1024 * 8)) != -1) {
                    zos.write(bufs, 0, read);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            log.error(srcDir+"压缩失败");
            return false;
        }finally {
            try {
                if(zos != null){
                    zos.close();
                }
                if(fos != null){
                    fos.close();
                }
                if(fis != null){
                    fis.close();
                }
                if(bis != null){
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Zip zip=new Zip();
        boolean b  =zip.toZip("D:/te/te","D:/te/te/","你好.zip");
    }
}
