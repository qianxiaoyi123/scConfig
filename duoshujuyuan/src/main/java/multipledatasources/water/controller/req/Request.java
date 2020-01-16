package multipledatasources.water.controller.req;
import java.io.Serializable;
/**
 *
 * @author lujingya 2018年7月17日12:03:02
 */
public class Request<T> implements Serializable {

    private static final long serialVersionUID = 838239970367364046L;
    private RequestHeader header;

    private RequestBody<T> body;

    public RequestHeader getHeader() {
        return header;
    }

    public void setHeader(RequestHeader header) {
        this.header = header;
    }

    public RequestBody<T> getBody() {
        return body;
    }

    public void setBody(RequestBody<T> body) {
        this.body = body;
    }
}
