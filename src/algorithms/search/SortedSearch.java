package search;

/** 有序线性查找
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/27/2018 9:54 AM
 */
public class SortedSearch {
    public int sortedLinearSearch(int[] a,int data){
        for(int i=0;i<a.length;i++){
            if(a[i] == data){
                return i;
            }else if(a[i]>data){
                return -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        SortedSearch ss = new SortedSearch();
        int result = ss.sortedLinearSearch(a,3);
        System.out.println(result);
    }
}
