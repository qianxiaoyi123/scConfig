package multipledatasources.water.controller.res;

import java.io.Serializable;

/**
 * @author lujingya 2018年7月17日12:01:52
 */
public class ResponseHeader implements Serializable {

    private static final long serialVersionUID = -199404662144798541L;

    private String code;

    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
