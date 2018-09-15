package mianshi.qiuzhao.cvte;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/14/2018 11:20 AM
 */
public class Quick1 {
    public void quick(int[] a,int start,int end){
        int len = a.length;
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
        }while(i<j);

        if(i<end){
            quick(a,i,end);
        }
        if(j>start){
            quick(a,start,j);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,0,3,6,7,8,7};
        Quick1 q = new Quick1();
        q.quick(a,0,a.length-1);
        for(int num:a){
            System.out.print(num);
        }
    }
}
