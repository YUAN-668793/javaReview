package algorithms.sort.thought;

/** 冒泡排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/15 22:01
 */

/**
 * 设置循环次数
 * 设置开始比较的位数，和结束的位数
 * 两两比较，把最小的数放到前面去
 *
 * 时间复杂度O（n^2)
 */
public class Bubble {
    public void bubbleSort(int[] a){
        int len = a.length;         //循环次数
        for(int i=0;i<len;i++){
            for(int j=0;j<len-i-1;j++){ //每一轮比较的次数
                if(a[j]>a[j+1]){        //如果前一位数比后一位数大，则交换（及向上冒泡）
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{4,7,8,4,2,3,6,1,0,5};
        Bubble b = new Bubble();
        b.bubbleSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
