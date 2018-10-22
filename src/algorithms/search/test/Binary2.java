package algorithms.search.test;

import algorithms.search.BinarySearch1;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 10/22/2018 11:17 AM
 */
public class Binary2 {
    public int binary(int[] a,int data){
        int low = 0;
        int high = a.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(data == a[mid]){
                return mid;
            }else if(data>a[mid]){
                low = mid+1;
            }else if(data<a[mid]){
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Binary2 bs = new Binary2();
        int[] a = {0,1,2,4,5,6,7,8,9,10};
        int result = bs.binary(a, 8);
        System.out.println(result);
    }
}
