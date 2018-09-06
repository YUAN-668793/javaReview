package mianshi.qiuzhao.date20180906.sort;

/** 冒泡排序优化
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/6/2018 1:23 PM
 */
public class BetterBubble {
    public void bubble(int[] a){
        int len = a.length;
        boolean swapFlag = true;
        for(int i=0;i<len && swapFlag;i++){
            swapFlag = false;
            for(int j = 0;j<len-i-1;j++){
                if(a[j+1]<a[j]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    swapFlag = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        BetterBubble betterBubble = new BetterBubble();
        int[] a = {1,0,3,6,7,9,8,5,1,2,4};
        betterBubble.bubble(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
