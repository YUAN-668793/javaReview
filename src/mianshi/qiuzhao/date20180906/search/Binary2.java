package mianshi.qiuzhao.date20180906.search;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/6/2018 2:58 PM
 */
public class Binary2 {
    public int binarySearch2(int[] a,int data){
        int low = 0;
        int high = a.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(a[mid] == data){
                return mid;
            }else if(a[mid]<data){
                low = mid+1;
            }else if(a[mid]>data){
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Binary2 binary1 = new Binary2();
        int[] a = {1,0,3,6,7,8,9,5,4};
        int result = binary1.binarySearch2(a,8);
        System.out.println(result);
    }
}
