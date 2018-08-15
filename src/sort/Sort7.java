package sort;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/15 20:46
 */
public class Sort7 {

    public void mergeSort(int[] a,int left,int right){
        int t = 1; //每组元素个数
        int size = right-left+1;
        while(t<size){
            int s = t;    //本次循环每组元素个数
            t = 2*s;
            int i = left;
          // while(i+(t-1)<size)
        }
    }
}
