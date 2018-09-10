package sort.thought_test;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/15 21:25
 */
public class Test1 {

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
        int[] a = new int[]{4,5,2,3,4,7,8,9,1,0};
        Test1 insert = new Test1();
        insert.insertSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
