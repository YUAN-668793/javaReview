package sort.zDay03;

/** 插入排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/26/2018 9:44 PM
 */
public class Test3 {
    public void insertSort(int[] a){
        int len = a.length;
        int j;
        int insertNum;
        for(int i=1;i<len;i++){
            j = i-1;
            insertNum = a[i];
            while (j>=0 && insertNum<a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = insertNum;
        }
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        int[] a = {1,4,2,0,3,6,9,8,7};
        t.insertSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
