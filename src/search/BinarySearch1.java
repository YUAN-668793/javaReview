package search;

/** 迭代的二分查找算法
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/27/2018 10:03 AM
 */
public class BinarySearch1 {
    public int binarySearchIterative(int[] a,int data){
        int low = 0;
        int high = a.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(a[mid] == data){
                return mid;
            }else if(a[mid]<data){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch1 bs = new BinarySearch1();
        int[] a = {0,1,2,4,5,6,7,8,9,10};
        int result = bs.binarySearchIterative(a, 8);
        System.out.println(result);
    }
}
