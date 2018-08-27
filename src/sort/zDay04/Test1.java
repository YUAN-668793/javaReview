package sort.zDay04;

/** 冒泡排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/27/2018 8:44 PM
 */
public class Test1 {
    public void bubbleSort(int[] a){
        int len = a.length;
        boolean swapFlag = true;
        for(int i=0;i<a.length && swapFlag;i++){
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
        Test1 t = new Test1();
        int[] a = {1,0,2,3,7,9,5,8,6,4};
        t.bubbleSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
