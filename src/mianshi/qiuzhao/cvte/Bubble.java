package mianshi.qiuzhao.cvte;

/** 冒泡排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/14/2018 1:00 AM
 */
public class Bubble {
    public void bubble(int[] a){
        int len = a.length;
        boolean swapFlag = true;
        for(int i=0;i<len && swapFlag;i++){
            swapFlag = false;
            for(int j=0;j<len-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapFlag = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,0,3,6,9,7,8,5,2};
        Bubble bu = new Bubble();
        bu.bubble(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
