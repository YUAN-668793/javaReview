package sort.thought;

/** 直接插入排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/15 21:00
 */

/**
 * 思想：
 * 设定插入次数，即循环的次数，第一个数不用插入，即length-1次，总共
 * 设定要插入数的位数和有序序列最后一位的位数
 * 从最后一位向前循环，如果插入数小于当前数，就将当前数向后移动一位
 * 如果大于当前数，将当前数放到该位置
 */
public class Insert {

    public void insertSort(int[] a){
        int len = a.length;
        for(int i=1;i<len;i++){  //因为第一次不用，所以从1开始
            int insertNum = a[i];    //要插入的数
            int j = i-1;        //有序序列的最后一位索引
            while(j>=0 && insertNum<a[j]){
                a[j+1] = a[j];     //元素向后移动
                j--;
            }
            a[j+1] = insertNum;     //找到位置，插入当前元素
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{4,5,2,3,4,7,8,9,1,0};
        Insert insert = new Insert();
        insert.insertSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
