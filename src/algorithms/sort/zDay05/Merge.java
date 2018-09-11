package algorithms.sort.zDay05;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/10/2018 6:15 PM
 */
public class Merge {
    public void merge(int[] a,int low,int mid,int high){
        int[] temp = new int[high-low+1];
        int i = low;
        int j = mid+1;
        int k = 0;
        while(i<=mid && i<=high){
            if(a[i]<a[j]){
                temp[k++] = a[i++];
            }else{
                temp[k++] = a[j++];
            }
        }
        //把左边剩余的数移入数组
        while(i<=mid){
            temp[k++] = a[i++];
        }
        //把右边剩余的数移入数组
        while(j<=high){
            temp[k++] = a[j++];
        }
        //把新数组中的数覆盖nums数组
        for(int k2 = 0;k2<temp.length;k2++){
            a[k2+low] = temp[k2];
        }
    }
    public void mergeSort(int[] a,int low,int high){
        int mid = (high+low)/2;
        if(low<high){
            mergeSort(a,low,mid);
            mergeSort(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }
}
