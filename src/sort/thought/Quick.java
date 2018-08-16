package sort.thought;

/** 快速排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/16 8:56
 */

/**
 * 思想：
 * 选定第一个为基准值，定义交换临时值
 * 当基准值左边的值小于基准值，基准值右边的值大于基准值时，i++,j--(前提条件：i<=j)
 * 当基准值左边的值大于基准值，基准值右边的值小于基准值时，借用临时值进行交换
 * 当一趟快速排序结束时，即i>j
 * 当满足j>start,i<end时，递归该方法，分别将i值和j值作为end值和start值参数
 *
 */
public class Quick {

    public void quickSort(int[] a,int start,int end){
        if(start<end){
            int baseNum = a[start];   //选定基准值
            int temp;     //交换临时值
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
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,7,4,3,2,0,5,9};
        Quick q = new Quick();
        q.quickSort(a,0,a.length-1);
        for(int num:a){
            System.out.print(num);
        }
    }
}
