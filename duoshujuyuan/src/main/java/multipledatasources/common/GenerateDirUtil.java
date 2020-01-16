package multipledatasources.common;

import javax.activation.MimetypesFileTypeMap;
import java.io.File;

/**
 * Created by zhangmingyu on 2019/11/13.
 */
public class GenerateDirUtil {
    public static enum Type{
        DEFAULT,
        FILETYPE
    }

    /**
     *  <p>
     *  type为DEFAULT或者type为null时：获取原文件所在路径，直接在FTP创建此路径保存
     *  type为FILETYPE时：则根据文件类型创建目录
     *  </p>
     *  @method_Name    : fileDirectory
     *  @author         : Maple
     *  @creation       : 2019年3月15日 下午1:59:31
     *  @param file
     *  @return
     */
    public static String fileDirectory(File file, Type type){
        if(Type.FILETYPE.equals(type)){
            String resDir = "/";
            resDir = new MimetypesFileTypeMap().getContentType(file);
            resDir.replace('\\', '/');
            return "/"+resDir;
        }else{
            String resDir = "/";
            resDir = file.getParent();
            return resDir;
        }
    }
}
