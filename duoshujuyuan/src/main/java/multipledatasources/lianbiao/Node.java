package multipledatasources.lianbiao;

/**
 * Created by zhangmingyu on 2019/10/10.
 */
public class Node {
    public int data;//数据域
    public Node next;//指针域

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
