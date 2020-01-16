package multipledatasources.water.controller.req;

import java.io.Serializable;
/**
 *
 * @author lujingya 2018年7月17日12:03:02
 */
public class RequestHeader implements Serializable {

    private static final long serialVersionUID = 2669093429304351809L;
    private String requestType;

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

}
