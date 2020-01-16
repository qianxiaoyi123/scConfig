package multipledatasources.water.controller.res;

import java.io.Serializable;
/**
 *
 * @author lujingya 2018年7月17日12:03:02
 */
public class ResponseBody<T> implements Serializable {

    private static final long serialVersionUID = 8961923780363116177L;
    T body;

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

}

