package multipledatasources.water.controller.res;
import java.io.Serializable;

/**
 *
 * @author lujingya 2018年7月17日12:03:02
 */
public class Response<T> implements Serializable {

    private static final long serialVersionUID = -9151726182095287949L;
    private ResponseHeader header;

    private ResponseBody<T> body;

    public ResponseHeader getHeader() {
        return header;
    }

    public void setHeader(ResponseHeader header) {
        this.header = header;
    }

    public ResponseBody<T> getBody() {
        return body;
    }

    public void setBody(ResponseBody<T> body) {
        this.body = body;
    }
}
