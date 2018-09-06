package sort.Network;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/15 19:48
 */
public class Sort3Test {

    public void selectSort(int[] a){
        int len = a.length;
        for(int i=0;i<len;i++){
            int value = a[i];
            int position = i;
            for(int j = i+1;j<len;j++){
                if(a[j]<value){
                    value = a[j];
                    position = j;
                }
            }
            a[position] = a[i];
            a[i] = value;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{4,2,1,5,7,8,3,6,9};
        Sort3Test s = new Sort3Test();
        s.selectSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
