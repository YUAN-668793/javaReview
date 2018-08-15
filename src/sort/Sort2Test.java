package sort;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/15 19:17
 */
public class Sort2Test {

    public void sheelSort(int[] a){
        int len = a.length;
        while(len != 0){
            len = len/2;
            for(int i=0;i<len;i++){
                for(int j = i+=len;j<a.length;j+=len){
                    int k= j-len;
                    int temp = a[j];
                    while(k>=0 && temp<a[k]){
                        a[k+len] = a[k];
                        k-=len;
                    }
                    a[k+len] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{4,2,1,5,7,8,3,6,9};
        Sort2Test s = new Sort2Test();
        s.sheelSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
