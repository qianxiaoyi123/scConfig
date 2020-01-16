package multipledatasources.sort;

/**
 * 堆排序  数组中下标为i的节点的左子节点就是下标为i*2的节点  右子节点就是下标为i*2+1  父节点就是i/2
 * Created by zhangmingyu on 2019/11/14.
 * 1向堆中插入元素的过程称为堆化，两种方式 从下往上 和从上往下两种
 */
public class HeatSort {
    private int a[];//对中存储的元素 从1开始存储
    private int n;//堆中可存储的最大数据个数
    private int count;//堆中当前已存储的数据个数

    public HeatSort(int capacity) {
        a = new int[capacity + 1];
        n = capacity;
        count = 0;
    }

    public static void swap(int[] a, int son, int fat) {
        int temp = a[fat];
        a[fat] = a[son];
        a[son] = temp;

    }

    //堆化 插入数据 自下向上
    public void insert(int data) {
        if (count >= n) {
            return;
        }
        count++;
        a[count] = data;
        int i = count;
        while (i / 2 > 0 && a[i] > a[i / 2]) { //自下向上堆化
            swap(a, i, i / 2);
            i = i / 2;
        }
    }

    //删除堆中的一个元素 可以考虑将堆的最后一个元素放在堆顶！d=====(￣▽￣*)b 然后再通过 堆化 自上而下的方法使得堆满足
    public void removeMax() {
        if (count == 0) {
            return;
        }
        a[1] = a[count];
        count--;
        heapify(a,count,1);
    }
    public static void heapify(int[]a,int n,int i){
        while (true){
            int maxPos=i;
            if(i*2<=n&&a[i]<a[i*2]){
                maxPos=i*2;
            }
            if(i*2+1<=n&&a[maxPos]<a[i*2+1]){
                maxPos=i*2+1;
            }
            if (maxPos==i){
                break;
            }
            swap(a,i,maxPos);
            i=maxPos;
        }


    }
    public  void heapify1(int[]a,int n,int i){
        while (true){
            int temp=i;
         if(i*2<=n&&a[i]>a[2*i]){
             temp=2*i;
         }
            if(i*2+1<=n&&a[temp]>a[2*i+1]){
                temp=2*i+1;
            }
            if(i==temp){
                break;
            }
            swap(a,i,temp);
            i=temp;
        }
    }
    public void tese(int []a,int n){
        for (int i = n/2; i>=1 ; i--) {
            heapify1(a, n, i);

        }

    }
    //堆排序的过程   与由上而下堆化一样，先建堆，然后依次将堆顶元素入数字尾部
    public static void buildHeap(int[] a,int n){
        for (int i= n/2; i>=1 ; i--) {
            heapify(a,n,i);

        }


    }
    public static void sort(int[] a,int n){
        buildHeap(a,n);
        int k=n;
        while (k>1){
            swap(a,1,k);
            k--;
            heapify(a,k,1);
        }
    }

    public static void main(String[] args) {
        int [] a={1,3,1,4,2,8,7,9};
        sort(a,7);
        for (int i =0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}
