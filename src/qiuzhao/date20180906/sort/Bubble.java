package qiuzhao.date20180906.sort;

/** 冒泡排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/6/2018 12:29 PM
 */
public class Bubble {
    public void bubble(int[] a){
        int len = a.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len-i-1;j++){
                if(a[j+1]<a[j]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1,3,5,7,9,6,8,4,5,0};
        Bubble bubble = new Bubble();
        bubble.bubble(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
