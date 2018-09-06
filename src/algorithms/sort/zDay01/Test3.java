package sort.zDay01;

/** 选择排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/17 13:25
 */
public class Test3 {

    public void selectSort(int[] a){
        int len = a.length;
        int min;
        int position;
        for(int i=0;i<len;i++){
            min = a[i];
            position = i;
            for(int j=i;j<len;j++){
                if(min>a[j]){
                    min = a[j];
                    position = j;
                }
            }
            int temp = a[i];
            a[i] = min;
            a[position] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,4,5,9,7,6,3,0,2};
        Test3 t = new Test3();
        t.selectSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
