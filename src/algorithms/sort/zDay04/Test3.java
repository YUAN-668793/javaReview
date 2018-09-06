package sort.zDay04;

/** 插入排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/27/2018 9:03 PM
 */
public class Test3 {
    public void insertSort(int[] a){
        int len = a.length;
        int j,insertNum;
        for(int i=1;i<len;i++){
            j = i-1;
            insertNum = a[i];
            while(j>=0 && a[j]>insertNum){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = insertNum;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,0,2,5,6,8,9,3};
        Test3 t = new Test3();
        t.insertSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
