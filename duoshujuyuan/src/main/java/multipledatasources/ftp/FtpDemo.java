package multipledatasources.ftp;

import multipledatasources.bean.FtpBean;
import multipledatasources.common.FtpUtil;
import multipledatasources.common.GenerateDirUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;

/**
 * Created by zhangmingyu on 2019/11/13.
 */
public class FtpDemo {
    public static void main(String[] args){

        //获取本地需要上传的文件，此处只用作测试
        File file = new File("D:/te/te/你好.zip");

        if(file.isFile() && file.exists()){

            //设置FTP上传的基本信息，可直接初始化数据
            FtpBean ftp = new FtpBean();

            //自动生成路径，默认取源文件路径，为FILETYPE时，取文件类型做路径
            //如使用自己的路径，直接ftp.setBasepath赋值即可
           // String basepath = GenerateDirUtil.fileDirectory(file, GenerateDirUtil.Type.FILETYPE);
           // ftp.setBasepath(basepath);
            ftp.setBasepath("nihao");
            ftp.setUsername("btftp");
            ftp.setPassword("1qaz2wsx@");
            ftp.setAddress("10.99.23.97");
            ftp.setPort("21");
            ftp.setSaveFileType(1);


            /**
             * 文件名生成方式
             * 1、自己命名			ftp.setBasepath("aaaa.txt");
             * 2、取文件原名字		ftp.setBasepath(file.getName());
             * 3、根据时间戳自动生成
             */
            SimpleDateFormat sdfms = new SimpleDateFormat("yyyyMMddHHmmssSSS");
            String date = sdfms.format(System.currentTimeMillis());
            //添加三位自动生成的数字，防止重复
            int i=(int)(Math.random()*900)+100;
            String fileName = date + i +".zip";
            ftp.setFileName(fileName);
           // ftp.setFileName(file.getName());
            //测试命名重复递增
            fileName = "aaa.txt";

            try{
                //将文件转换成一个输入流
                InputStream in = new FileInputStream(file);
                ftp.setInputStream(in);

                //传入文件名称，和文件输入流，上传至FTP服务器
                boolean isOk = FtpUtil.uploadFile(ftp);
                if(isOk){
                    System.out.println("文件上传成功");
                }else{
                    System.out.println("文件上传失败");
                }
                in.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            System.out.println("文件不存在");
        }
    }
}

