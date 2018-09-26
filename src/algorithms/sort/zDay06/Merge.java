package algorithms.sort.zDay06;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/27/2018 1:03 AM
 */
public class Merge {
    public void merge(int[] a,int low,int mid,int high){
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

    public void mergeMethod(int[] a,int low,int high){
        int mid = (high+low)/2;
        if(low<high){
            mergeMethod(a,low,mid);
            mergeMethod(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }

    public static void main(String[] args) {
        Merge m = new Merge();
        int[] a = {1,0,3,2,5,6,8,1,2};
        m.mergeMethod(a,0,a.length-1);
        for(int num:a){
            System.out.print(num);
        }
    }
}
