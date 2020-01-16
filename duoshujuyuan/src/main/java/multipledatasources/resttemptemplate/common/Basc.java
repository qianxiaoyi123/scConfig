package multipledatasources.resttemptemplate.common;

import sun.misc.BASE64Encoder;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by zhangmingyu on 2019/2/25.
 */
public class Basc {
    public static String base(String imgFile){
        InputStream inputStream=null;
        byte[] data=null;
        try{
            inputStream =new FileInputStream(imgFile);
            data=new byte[inputStream.available()];
            inputStream.read(data);
            inputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        BASE64Encoder encoder=new BASE64Encoder();
        return encoder.encode(data);
    }
}
