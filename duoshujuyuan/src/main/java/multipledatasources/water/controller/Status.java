package multipledatasources.water.controller;

/**
 * 业务逻辑处理完后返回状态码以及错误信息
 * @author lujingya 2018年7月20日12:57:49
 */
public enum Status {

    SUCCESS("200","成功"),
    PRIV_ERROR("300","无权限操作"),
    ARG_ERROR("400","参数异常"),
    SYS_ERROR("500","系统异常");
    private String code;
    private String message;
    private Status(String code, String message) {
        this.code = code;
        this.message = message;
    }
    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
