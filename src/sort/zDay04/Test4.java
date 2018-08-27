package sort.zDay04;

/** 快速排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/27/2018 9:07 PM
 */
public class Test4 {
    public void quickSort(int[] a,int start,int end){
        if(start<end){
            int i = start;
            int j = end;
            int temp;
            int baseNum = a[i];
            do{
                while(i<end && a[i]<baseNum){
                    i++;
                }
                while(j>start && a[j]>baseNum){
                    j--;
                }
                if(i<=j){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    j--;
                    i++;
                }
            }while(i<=j);
            if(start<j){
                quickSort(a,start,j);
            }
            if(end>i){
                quickSort(a,i,end);
            }
        }
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        int[] a = {1,0,2,3,5,6,8,7,9};
        t.quickSort(a,0,a.length-1);
        for(int num:a){
            System.out.print(num);
        }
    }
}
