package sort.thought;

import java.util.Arrays;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/16 13:46
 */

/**
 * 思想
 * 申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列
 * 设定两个指针，最初位置分别为两个已经排序序列的起始位置
 * 比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置
 * 重复步骤3直到某一指针达到序列尾
 * 将另一序列剩下的所有元素直接复制到合并序列尾
 */
public class Merge {

    public void merge(int[] a,int low,int mid,int high){
        int[] temp = new int[high-low+1];
        int i = low;   //左指针
        int j = mid+1; //右指针
        int k = 0;    //新数组索引
        //把较小的数先移到新数组中
        while(i<=mid && j<=high){
            if(a[i]<a[j]){
                temp[k++] = a[i++];
            }else{
                temp[k++] = a[j++];
            }
        }
        //把左边剩余的数移入数组
        while(i<=mid){
            temp[k++] = a[i++];
        }
        //把右边剩余的数移入数组
        while(j<=high){
            temp[k++] = a[j++];
        }
        //把新数组中的数覆盖nums数组
        for(int k2 = 0;k2<temp.length;k2++){
            a[k2+low] = temp[k2];
        }
    }

    //调用归并排序方法
    public void mergeSort(int[] a,int low,int high){
        int mid = (low+high)/2;
        if(low<high){
            //左边
            mergeSort(a,low,mid);
            //右边
            mergeSort(a,mid+1,high);
            //左右归并
            merge(a,low,mid,high);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,4,5,7,8,9,6,3,2,5};
        Merge m = new Merge();
        m.mergeSort(a,0,a.length-1);
        System.out.println("排序结果："+Arrays.toString(a));
    }
}
