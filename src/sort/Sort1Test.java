package sort;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/15 16:49
 */
public class Sort1Test {
    public void insertSort(int[] a){
        int len = a.length;
        int insertNum ;
        for(int i=1;i<len;i++){
            insertNum = a[i];
            int j = i-1;
            while(j>=0 && a[j]>insertNum){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = insertNum;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{4,6,2,7,8,9,2,1};
        Sort1Test s = new Sort1Test();
        s.insertSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
