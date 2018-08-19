package sort.zDay02;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/19 13:35
 */
public class Test5 {

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

    public void mergeSort(int[] a,int low,int high){
        int mid = (low+high)/2;
        if(low<high){
            mergeSort(a,low,mid);
            mergeSort(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,4,3,6,0,2,7,9,8};
        Test5 t = new Test5();
        t.mergeSort(a,0,a.length-1);
        for(int num:a){
            System.out.print(num);
        }
    }
}
