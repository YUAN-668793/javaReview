package algorithms.sort.zDay06;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/27/2018 12:43 AM
 */
public class Bubble {
    public void bubble(int[] a){
        int len = a.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,0,3,2,5,6,8,7};
        Bubble b = new Bubble();
        b.bubble(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
