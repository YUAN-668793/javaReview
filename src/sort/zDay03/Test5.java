package sort.zDay03;

/** 归并排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/26/2018 10:04 PM
 */
public class Test5 {
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
        while (i<=mid){
            temp[k++] = a[i++];
        }
        while(j<=high){
            temp[k++] = a[j++];
        }
        for(int k2 = 0;k2<temp.length;k2++){
            a[k2+low] = temp[k2];
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
        Test5 t = new Test5();
        int[] a = {1,0,2,8,5,6,3,7};
        t.merge(a,0,a.length-1);
        for(int num:a){
            System.out.print(num);
        }
    }
}
