package sort.zDay03;

/**冒泡排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/26/2018 8:36 PM
 */
public class Test1 {
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
        Test1 t = new Test1();
        int[] a = {1,4,5,2,7,8,9,6,0,3};
        t.bubbleSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
