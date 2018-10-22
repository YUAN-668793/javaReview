package algorithms.sort.zDay07;

import java.util.Arrays;

/** 归并排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 10/22/2018 11:00 AM
 */
public class Merge {
    public static void merge(int[] a,int low,int mid,int high){
        int[] temp = new int[high-low+1];
        int i = low;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=high){
            if(a[i]<a[j]){
                temp[k++] = a[i++];
            }else{
                temp[k++] = a[j++];
            }
        }
        while(i<=mid){
            temp[k++] = a[i++];
        }
        while(j<=high){
            temp[k++] = a[j++];
        }
        for(int k2 = 0;k2<temp.length;k2++){
            a[k2+low] = temp[k2];
        }
    }


    public static void mergeSort(int[] a,int low,int high){
        int mid = (low+high)/2;
        if(low<high){
            mergeSort(a,low,mid);
            mergeSort(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }
    public static void main(String[] args) {
        int[] a = {1,4,5,7,8,9,6,3,2,5};
        Merge m = new Merge();
        m.mergeSort(a,0,a.length-1);
        System.out.println("排序结果："+ Arrays.toString(a));
    }
}
