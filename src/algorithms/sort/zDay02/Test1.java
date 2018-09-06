package sort.zDay02;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/19 12:52
 */
public class Test1 {
    public void selectSort(int[] a){
        int len = a.length;
        int position;
        for(int i=0;i<len;i++){
            int min = a[i];
            position = i;
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
        int[] a = {1,7,5,8,9,3,2,0,4};
        Test1 t = new Test1();
        t.selectSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
