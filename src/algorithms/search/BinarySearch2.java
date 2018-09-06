package algorithms.search;

/** 递归的二分查找算法
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/27/2018 10:09 AM
 */
public class BinarySearch2 {
    public int binarySearchRescursive(int[] a,int low,int high,int data){
        int mid = low +(high-low)/2;
        if(a[mid] == data){
            return mid;
        }else if(a[mid]<data){
            return binarySearchRescursive(a,mid+1,high,data);
        }else if(a[mid]>data){
            return binarySearchRescursive(a,low,mid-1,data);
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch2 bs = new BinarySearch2();
        int[] a = {0,1,2,4,5,6,7,8,9,10};
        int result = bs.binarySearchRescursive(a,0,a.length-1,8);
        System.out.println(result);
    }
}
