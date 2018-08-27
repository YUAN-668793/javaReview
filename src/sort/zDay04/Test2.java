package sort.zDay04;

/** 选择排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/27/2018 8:50 PM
 */
public class Test2 {
    public void selectSort(int[] a){
        int len = a.length;
        for(int i=0;i<len;i++){
            int min = a[i];
            int position = 0;
            for(int j = i;j<len;j++){
                if(a[j]<min){
                    min = a[j];
                    a[j] = a[i];
                    a[i] = min;
                }
            }
        }
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        int[] a = {1,0,5,2,3,7,8,9,6};
        t.selectSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
