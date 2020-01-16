package multipledatasources.common;

/**
 * Created by zhangmingyu on 2020/1/10.
 */
public class ChkRel {
    private String Result;

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }

    public String getMsg() {
        return Msg;
    }

    @Override
    public String toString() {
        return "ChkRel{" +
                "Result='" + Result + '\'' +
                ", Msg='" + Msg + '\'' +
                '}';
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    private String Msg;

    public ChkRel(String result, String msg) {
        Result = result;
        Msg = msg;
    }
}
