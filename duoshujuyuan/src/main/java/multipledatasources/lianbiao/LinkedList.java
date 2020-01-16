package multipledatasources.lianbiao;

/**
 * Created by zhangmingyu on 2019/10/11.
 */
public class LinkedList {
    private Node head;//头结点

    //新增节点，在尾部新增
    public void addHead(Node node) {
        //头结点是否存在
        if (head == null) {
            head = node;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = node;
    }

    //新增节点 在头部新增
    public void addTail(Node node) {

        node.next = head;
        head = node;

    }

    //遍历节点
    public void getAllNode() {
        if (head == null) {
            return;
        }
        Node currentNode = head;
        System.out.println(head.data + ",");
        while (currentNode.next != null) {
            System.out.println(currentNode.next.data + ",");
            currentNode = currentNode.next;
        }
    }

    //链表反转，遍历法，输入原链表头结点，返回反转后链表的头结点（即原链表的尾节点）
    public Node reversal(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node preNode = head;
        Node currentNode = head.next;
        Node temp;
        while (currentNode != null) {
            temp = currentNode.next;
            currentNode.next = preNode;
            //节点向后移动
            preNode = currentNode;
            currentNode = temp;
        }
        head.next = null;
        return preNode;
    }
    //链表反转，遍历法，输入原链表头结点，返回反转后链表的头结点（即原链表的尾节点）
    public Node test(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node preNode=head;
        Node current=head.next;
        Node temp;
        while (current.next!=null){
            temp=current.next;
            current.next=preNode;
            //后移节点 while继续循环
            preNode=current;
            current=temp;
        }
        head.next = null;
        return preNode;
    }
    //  如何检测链表中环的存在
    public boolean check(Node head){
        Node query=head;
        Node currentNode=head;
        while (query!=null&&query.next!=null){
            query=query.next.next;
            currentNode=currentNode.next;
            if(currentNode==query){
                return true;
            }
        }
        return false;

    }
    //链表右移k

    public Node rotate(Node head,int k){
        if (head==null||k<=0){
            return head;
        }
        Node tempHead=new Node(0);
        tempHead.next=head;
        Node last=tempHead;
        Node first=tempHead;
        int len=0;
        while (last.next!=null){
            last=last.next;
            len++;
        }
        last=tempHead;
        k=k%len;
        if (k==0){
            return tempHead.next;
        }
        while (--k>=0){
            first=first.next;
        }
        while (first.next!=null){
            last=last.next;
            first=first.next;
        }
        tempHead.next=last.next;
        first.next=head;
        last.next=null;
        return tempHead.next;
    }


    //查链表的长度
    public int length() {
        if (head == null) {
            return 0;
        }
        int length = 1;
        Node currentNode = head;
        while (currentNode.next != null) {
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }
    //      删除下标为K的节点
    public boolean delete(int k) {
        if (k < 0 || k > length() - 1) {
            //下标越界异常处理
            return false;
        }
        if (k == 0) {
            head = head.next;
            return true;
        }
        int j = 1;
        Node currentNode = head;
        Node nextNode = currentNode.next;
        while (j < k) {
            currentNode = currentNode.next;
            nextNode = nextNode.next;
            j++;
        }
        currentNode.next = nextNode.next;
        return true;
    }
    //查找下标为k的节点
    public Node select(int k) {
        if (k < 0 || k > length() - 1) {
            return null;
        }
        if (k == 0) {
            return head;
        }
        Node currentNode = head;
        int j = 0;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            j++;
            if (j == k) {
                return currentNode;
            }

        }
        return null;
    }
    //在下标为k的位置插入节点
    public boolean insert(int k, Node node) {
        if (k < 0 || k > length() - 1) {
            return false;
        }
        if (k == 0) {
            node.next = head;
            head = node;
            return true;
        }
        Node currentNode = head;
        int i = 1;
        while (i < k) {
            currentNode = currentNode.next;
            i++;
        }
        node.next = currentNode.next;
        currentNode.next = node;
        return true;
    }
    //排序节点
    public void sort() {
        if (head == null) {
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            Node nextNode = currentNode.next;
            while (nextNode != null) {
                if (currentNode.data > nextNode.data) {
                    int temp = currentNode.data;
                    currentNode.data = nextNode.data;
                    nextNode.data = temp;
                }
                nextNode = nextNode.next;
            }
            currentNode = currentNode.next;
        }

    }

    //leetcode 59 螺旋矩阵2
    public int[][] spira(int k){

        int temp=1;
        int[][] a=new int[k][k];
        int r1=0,r2=k-1;
        int c1=0,c2=k-1;
        while (r1<=r2&&c1<=c2){
            for (int c=c1 ; c<=c2  ; c++) {
                a[r1][c]=temp;
                temp++;
            }
            for (int r=r1+1 ; r<=r2  ; r++) {
                a[r1][c2]=temp;
                temp++;
            }
            if (r1<r2&&c1<c2){
                for (int c = c2-1; c >c1 ; c--) {
                    a[r2][c]=temp;
                    temp++;
                }
                for (int r = r2; r >r1 ; r--) {
                    a[r][c1]=temp;
                    temp++;
                }
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return a;
    }
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node node5 = new Node(50);
        l.addHead(node1);
        l.addHead(node2);
        l.addHead(node3);
        l.addHead(node4);
     //   l.getAllNode();
        l.addTail(node5);
      //  l.getAllNode();
      //  Node reversal = l.test(node2);
       // Node reversal = l.rotate(l.head,2);
        int [][] reversal = l.spira(3);
       // rotate
        for (int i = 0; i <reversal.length ; i++) {
            for (int j = 0; j <reversal[0].length ; j++) {
                System.out.println(reversal[i][j]);
            }
        }


    }
}
