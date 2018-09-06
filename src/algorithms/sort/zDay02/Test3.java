package sort.zDay02;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/19 12:59
 */
public class Test3 {

    public void insertSort(int[] a){
        int len = a.length;
        for(int i=1;i<len;i++){
            int j = i-1;
            int insertNum = a[i];
            while(j>=0 && insertNum<a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = insertNum;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,4,5,6,3,2,9,8,7,0};
        Test3 t = new Test3();
        t.insertSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
