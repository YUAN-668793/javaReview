package sort.thought_test;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/15 22:11
 */
public class Test2 {

    public void selectSort(int[] a){
        int len = a.length;
        for(int i=0;i<len;i++){
            int min = a[i];
            int position = i;
            for(int j=i;j<len;j++){
                if(min>a[j]){
                    min = a[j];
                    position = j;
                }
            }
            a[position] = a[i];
            a[i] = min;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,4,7,9,2,3,8,2};
        Test2 t = new Test2();
        t.selectSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
