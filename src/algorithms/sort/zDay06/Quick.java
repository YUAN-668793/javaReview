package algorithms.sort.zDay06;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/27/2018 12:55 AM
 */
public class Quick {
    public void quick(int[] a,int start,int end){
        if(start<end){
            int i = start;
            int j = end;
            int baseNum = a[start];
            int temp;
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

            }while(i<=j);
            if(i<end){
                quick(a,i,end);
            }
            if(j>start){
                quick(a,start,j);
            }
        }
    }

    public static void main(String[] args) {
        Quick q = new Quick();
        int[] a = {1,2,3,6,4,7,8,5};
        q.quick(a,0,a.length-1);
        for(int num:a){
            System.out.print(num);
        }
    }
}
