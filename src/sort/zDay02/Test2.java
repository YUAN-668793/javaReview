package sort.zDay02;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/19 12:57
 */
public class Test2 {

    public void bubbleSort(int[] a){
        int len = a.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        int[] a = {1,4,7,8,5,3,2,6,8,0};
        t.bubbleSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
