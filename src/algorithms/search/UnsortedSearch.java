package algorithms.search;

/** 无序线性查找
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/27/2018 9:48 AM
 */
public class UnsortedSearch {
    public int unsorteddLinearSearch(int[] a,int data){
        for(int i=0;i<a.length;i++){
            if(a[i] == data){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,0,2,7,8,5,3,6};
        UnsortedSearch us = new UnsortedSearch();
        int result = us.unsorteddLinearSearch(a,5);
        System.out.println(result);
    }
}
