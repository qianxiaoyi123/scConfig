package multipledatasources.sort;

/**快速排序
 * Created by zhangmingyu on 2019/11/14.
 * 基本思想，选择一个基准点  默认数组第一个吧 这种情况需要从后开始  向前遍历  找到第一个比基准小的数j   再从左开始遍历 找第一个比基准大的数i
 * 然后交换ij，然后继续遍历直到第一轮结束   递归调用    终止条件 左边大于右边
 * 时间复杂度 大部分情况下是O{nlogn} 极端情况下会退化成为O{n^2}
 */
public class QuickSort {
    public static void quickSort(int[]arry ,int start,int end){
        if (start>end){
            return;
        }
        int i,j,temp,t;
        i=start;
        j=end;
        temp=arry[i];
        while (i<j){
            while (temp<=arry[j]&&i<j){
                j--;
            }
            while (temp>=arry[i]&&i<j){
                i++;
            }
            if(i<j){
                t=arry[j];
                arry[j]=arry[i];
                arry[i]=t;
            }
        }
        arry[start]=arry[i];
        arry[i]=temp;
        quickSort(arry,start,j-1);
        quickSort(arry,j+1,end);
    }

    public static void main(String[] args) {
        int[] a={1,9,8,5,4,8,7,9,2,1,5,4,6,3};
        quickSort(a,0,a.length-1);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);

        }
    }
}
