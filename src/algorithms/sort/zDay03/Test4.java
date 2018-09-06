package sort.zDay03;

/** 快速排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/26/2018 9:54 PM
 */
public class Test4 {
    public void quickSort(int[] a, int start, int end) {
        if (start < end) {
            int baseNum = a[start];
            int i = start;
            int j = end;
            int temp;
            do {
                while (i < end && a[i] < baseNum) {
                    i++;
                }
                while (j > start && a[j] > baseNum) {
                    j--;
                }
                if (i <= j) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    i++;
                    j--;
                }
            } while (i <= j);
            if (start < j) {
                quickSort(a, start, j);
            }
            if (end > i) {
                quickSort(a, i, end);
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,0,3,2,5,7,8,9,5};
        Test4 t = new Test4();
        t.quickSort(a,0,a.length-1);
        for(int num:a){
            System.out.print(num);
        }
    }
}
