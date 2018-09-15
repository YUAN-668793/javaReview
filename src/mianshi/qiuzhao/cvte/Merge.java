package mianshi.qiuzhao.cvte;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/14/2018 1:25 AM
 */
public class Merge {
    public void mergeSort(int[] a,int low,int mid,int high){
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
            for(int k2=0;k2<temp.length;k2++){
                a[low+k2] = temp[k2];
            }
    }

    public void merge(int[] a,int low,int high){
        int mid = (high+low)/2;
        if(low<high){
            merge(a,low,mid);
            merge(a,mid+1,high);
            mergeSort(a,low,mid,high);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,3,0,2,5,6,9,8,7};
        Merge me = new Merge();
        me.merge(a,0,a.length-1);
        for(int num:a){
            System.out.print(num);
        }
    }
}
