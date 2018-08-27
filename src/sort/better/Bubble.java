package sort.better;

/** 冒泡排序 优化
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/27/2018 6:54 PM
 */

/**
 * 设置标志位swapFlag = true，默认为全部已排好序。若在循环过程中
 * 出现（排序）交换动作，则swapFlag = true，说明循环还得继续；若
 * 无交换动作，说明已经排好序的了，不满足循环条件直接跳出，提高效率
 */
public class Bubble {
    public void bubbleSort(int[] a){
        int len = a.length;
        boolean swapFlag = true;    //标志位：交换标志位，true为无交换，false为有交换
        for(int i=0;i<len && swapFlag;i++){
            swapFlag = false;      //默认不存在交换,若无交换动作干扰，可以直接跳出循环
            for(int j=0;j<len-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapFlag = true;//若存在交换情况
                }
            }
        }
    }

    public static void main(String[] args) {
        Bubble b = new Bubble();
        int[] a = {1,0,2,3,5,6,7,9,4};
        b.bubbleSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
