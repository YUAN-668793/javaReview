package sort.zDay02;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/19 13:16
 */
public class Test4 {
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
            }while(i<=j);

            if(j>start){
                quickSort(a,start,j);
            }
            if(i<end){
                quickSort(a,i,end);
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,4,6,5,7,8,9,0,2,3};
        Test4 t = new Test4();
        t.quickSort(a,0,a.length-1);
        for(int num:a){
            System.out.print(num);
        }
    }
}
