package algorithms.sort.zDay07;

/** 快速排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 10/22/2018 10:51 AM
 */
public class Quick {
    public static void quick(int[] a,int start,int end){
        if(start<end){
            int i = start;
            int j = end;
            int baseNum = a[start];
            do{
                while(a[i]<baseNum && i<end){
                    i++;
                }
                while(a[j]>baseNum && j>start){
                    j--;
                }
                if(i<=j){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                    i++;
                    j--;
                }
            }while(i<=j);

            if(j>start){
                quick(a,start,j);
            }
            if(i<end){
                quick(a,i,end);
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,5,7,8,9,6,3,2,4,5};
        Quick.quick(a,0,a.length-1);
        for(int num:a){
            System.out.print(num);
        }
    }
}
