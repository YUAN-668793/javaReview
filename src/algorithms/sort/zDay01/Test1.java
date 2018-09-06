package sort.zDay01;

/** 冒泡排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/17 11:24
 */
public class Test1 {

    public void bubbleSort(int[] a){
        int len = a.length;
        for(int i = 0;i<len;i++){
            for(int j = 0;j<len-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,4,7,8,9,5,2,3,6,0};
        Test1 t = new Test1();
        t.bubbleSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }

}
