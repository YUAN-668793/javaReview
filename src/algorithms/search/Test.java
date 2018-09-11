package algorithms.search;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/10/2018 6:30 PM
 */
public class Test {
    public int binary(int[] a,int low,int high,int data){
        int mid = low+(high-low)/2;
        if(a[mid] == data){
            return mid;
        }else if(a[mid]>data){
            return binary(a,low,mid-1,data);
        }else if(a[mid]<data){
            return binary(a,mid+1,high,data);
        }
        return -1;
    }

    public static void main(String[] args) {
        Test bs = new Test();
        int[] a = {0,1,2,4,5,6,7,8,9,10};
        int result = bs.binary(a,0,a.length-1,8);
        System.out.println(result);
    }
}
