package algorithms.temp;

/** 选择排序
 *  首先，找到数组中最小的那个元素，其次，将它和数组的第一个元素交换位置，再到剩下的元素中找到最小的元素，将它与数组中的第二
 *  个元素交换位置，如此往复，直到这个数组有序。它在不断的选择剩余元素之中的最小者
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/7/27 14:49
 */
public class Select {
    //将a[]按升序排列
    public static void sort(Comparable[] a){
        //数组长度
        int N = a.length;
        for(int i=0;i<N;i++){
            //将a[i]和a[i+1..N]中最小的元素交换
            //最小元素的索引
            int min = i;
            for(int j = i+1;j<N;j++){
                if(less(a[j],a[min])) {
                    min = j;
                    exch(a,i,min);
                }
            }

        }
        for(Comparable result: a){
            System.out.print(result+" ");
        }
    }
    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w)<0;
    }
    public static void exch(Comparable[] a,int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{5,4,3,2,1,-1};
        sort(a);
    }
}
