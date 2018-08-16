package sort.thought_test;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/16 9:40
 */
public class Test4 {

    public void quickSort(int[] a,int start,int end){
        int baseNum = a[start];   //选定基准值
        int temp;    //定义交换临时变量
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
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }while(i<=j);
        if(start<j){
            quickSort(a,start,j);
        }
        if(end>i){
            quickSort(a,i,end);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{4,7,8,9,3,2,1,5,0};
        Test4 t = new Test4();
        t.quickSort(a,0,a.length-1);
        for(int num:a){
            System.out.print(num);
        }
    }

}
