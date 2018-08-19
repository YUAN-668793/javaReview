package sort.zDay01;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/19 13:08
 */
public class Test5 {

    public void quickSort(int[] a,int start,int end){
        if(start<end){
            int baseNum = a[start];
            int i = start;
            int j = end;
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
            }while (i<=j);
            if(start<j){
                quickSort(a,start,j);
            }if(i<end){
                quickSort(a,i,end);
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {2,5,4,7,8,3,6,0,1,9};
        Test5 t = new Test5();
        t.quickSort(a,0,a.length-1);
        for(int num:a){
            System.out.print(num);
        }
    }
}
