package multipledatasources.water.controller.res;


import multipledatasources.water.controller.Status;

/**
 * 返回结果
 * @author lujingya 2018年7月20日18:20:59
 */
public class Result {

    private String code;

    private String message;

    private Status status;

    public Result(Status status) {
        this.status = status;
    }

    public Result(String code, String message) {
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
