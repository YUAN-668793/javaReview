package algorithms.search.test;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 10/22/2018 11:10 AM
 */
public class Binary1 {
    public int binary(int[] a,int low,int high,int data){
        int mid = low + (high-low)/2;
        if(a[mid] == data){
            return mid;
        } else if (a[mid] < data) {
            return binary(a,mid+1,high,data);
        } else if(a[mid] >data){
            return binary(a,low,mid-1,data);
        }
        return -1;
    }
    public static void main(String[] args) {
        Binary1 bs = new Binary1();
        int[] a = {0,1,2,4,5,6,7,8,9,10};
        int result = bs.binary(a,0,a.length-1,8);
        System.out.println(result);
    }
}
