package sort.zDay01;

/** 插入排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/17 13:13
 */
public class Test2 {

    public void insertSort(int[] a){
        int len = a.length;
        int insertNum;
        int j;
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
        int[] a = {1,4,5,2,3,6,7,8,0};
        Test2 t = new Test2();
        t.insertSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
