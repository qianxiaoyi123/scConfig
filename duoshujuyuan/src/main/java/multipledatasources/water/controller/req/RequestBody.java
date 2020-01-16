package multipledatasources.water.controller.req;
import java.io.Serializable;
/**
 *
 * @author lujingya 2018年7月17日12:03:02
 */
public class RequestBody<T> implements Serializable {

    private static final long serialVersionUID = 192516218290456961L;
    T body;

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

}
