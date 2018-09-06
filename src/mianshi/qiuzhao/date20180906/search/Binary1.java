package mianshi.qiuzhao.date20180906.search;

/** 递归的二分查找算法
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/6/2018 2:46 PM
 */
public class Binary1 {
    public int binarySearch1(int[] a,int low,int high,int data){
        int mid = low+(high-low)/2;
        if(a[mid] == data){
            return mid;
        }else if(a[mid]<data){
            return binarySearch1(a,mid+1,high,data);
        }else if(a[mid]>data){
            return binarySearch1(a,low,mid-1,data);
        }
        return -1;
    }

    public static void main(String[] args) {
        Binary1 binary1 = new Binary1();
        int[] a = {1,0,3,6,7,8,9,5,4};
        int result = binary1.binarySearch1(a,0,a.length-1,8);
        System.out.println(result);
    }
}
