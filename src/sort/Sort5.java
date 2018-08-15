package sort;

/** 冒泡排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/15 20:15
 */
public class Sort5 {

    public void bubbleSort(int[] a){
        int len = a.length;
        for(int i = 0;i<len;i++){
            for(int j=0;j<len-j-1;j++){
                if(a[j]>a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{4,2,1,5,7,8,3,6,9};
        Sort5 s = new Sort5();
        s.bubbleSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
