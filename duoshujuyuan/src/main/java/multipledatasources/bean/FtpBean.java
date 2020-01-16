package multipledatasources.bean;

import java.io.InputStream;

/**
 * Created by zhangmingyu on 2019/11/13.
 */
public class FtpBean {
    /**
     * 部分信息如果传空的话，默认赋值，根据业务需求修改
     */
    //FTP服务器地址
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getBasepath() {
        return basepath;
    }

    public void setBasepath(String basepath) {
        this.basepath = basepath;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public Integer getSaveFileType() {
        return saveFileType;
    }

    public void setSaveFileType(Integer saveFileType) {
        this.saveFileType = saveFileType;
    }

    //FTP服务器端口号
    private String port;
    //FTP服务器用户名
    private String username;
    //FTP服务器密码
    private String password;
    //上传文件名称
    private String fileName;
    //基本路径
    private String basepath;
    //文件输入流
    private InputStream inputStream;
    //保存文件方式  默认：1-覆盖；2-文件名称后面+(递增数据)
    private Integer saveFileType;
}
