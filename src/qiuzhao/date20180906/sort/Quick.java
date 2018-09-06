package qiuzhao.date20180906.sort;

/** 快速排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/6/2018 12:51 PM
 */
public class Quick {
    public void quickSort(int[] a,int start,int end){
        if(start<end){
            int i = start;
            int j = end;
            int baseNum = a[i];
            do{
                while(a[i]<baseNum && i<end){
                    i++;
                }
                while(a[j]>baseNum && j>start){
                    j--;
                }
                if(i<=j){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    i++;
                    j--;
                }
            }while(i<=j);

            if(start<j){
                quickSort(a,start,j);
            }
            if(i<end){
                quickSort(a,i,end);
            }
        }
    }

    public static void main(String[] args) {
        Quick quick = new Quick();
        int[] a = {1,0,3,6,7,8,5,4,9};
        quick.quickSort(a,0,a.length-1);
        for(int num:a){
            System.out.print(num);
        }
    }
}
