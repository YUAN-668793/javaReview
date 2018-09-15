package mianshi.qiuzhao.cvte;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/14/2018 1:46 AM
 */
public class Quick {

    public void quick(int[] a,int start,int end){
        int len = a.length;
        int i = start;
        int j = end;
        int temp;
        int baseNum = a[start];
        do{
            while(a[i]<baseNum && i<end){
                i++;
            }
            while(a[j]>baseNum && j>start){
                j--;
            }
            if(i<=j){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }while (i<j);

        if(start<j){
            quick(a,start,j);
        }
        if(i<end){
            quick(a,i,end);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,7,3,2,0};
       Quick q = new Quick();
        q.quick(a,0,a.length-1);
        for(int num:a){
            System.out.print(num);
        }
    }
}
