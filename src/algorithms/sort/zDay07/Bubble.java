package algorithms.sort.zDay07;

/** 冒泡排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 10/22/2018 10:35 AM
 */
public class Bubble {
    public static void bubble(int[] a){
        int len = a.length;
        boolean flag = true;
        for(int i=0;i<len && flag;i++){
            flag = false;
            for(int j = 0;j<len-i-1;j++){
                if(a[j]>a[j+1]){
                    flag = true;
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int num:a){
            System.out.print(num);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,5,6,9,8,7,4,3,2};
        Bubble.bubble(a);
    }
}
