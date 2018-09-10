package algorithms.sort.thought;

/**堆排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/22/2018 8:56 PM
 */

import algorithms.sort.Network.Sort8;


/**
 * 基本思想
 * 对简单选择排序的优化。
 * 将序列构建成大顶堆。
 * 将根节点与最后一个节点交换，然后断开最后一个节点。
 * 重复第一、二步，直到所有节点断开。
 */
public class Heap {

    public void heapSort(int[] a){
        //循环建堆
        int len = a.length;
        for(int i=0;i<len-1;i++){
            //建堆
            buildMaxHeap(a,len-1-i);
            //交换堆顶和最后一个元素
            swap(a,0,len-1-i);
        }
    }

    //交换方法
    private void swap(int[] data,int i,int j){
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    //对data数组从0到lastIndex建大顶堆
    private void buildMaxHeap(int[] data,int lastIndex){
        //从lastIndex结点（最后一个结点的父节点开始）
        for(int i = (lastIndex-1)/2;i>=0;i--){
            //k保存正在判断的点
            int k =i;
            //如果当前k结点的子结点存在
            while(k*2+1 <= lastIndex){
                //k结点的左子结点的索引
                int biggerIndex = 2*k+1;
                //如果biggerIndex小于lastIndex，即biggerIndex+1代表的k结点的右子结点存在
                if(biggerIndex < lastIndex){
                    //如果右子结点的值较大
                    if(data[biggerIndex]<data[biggerIndex+1]){
                        //biggerIndex总是记录较大子结点的索引
                        biggerIndex++;
                    }
                }
                //如果k结点的值小于其较大的子结点的值
                if(data[k]<data[biggerIndex]){
                    //交换它们
                    swap(data,k,biggerIndex);
                    //将biggerIndex赋予k，开始while循环的下一次循环，重新保证k结点的值大于其左右子结点的值
                    k = biggerIndex;
                }else{
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Sort8 s = new Sort8();
        int[] a = {1,4,5,2,3,6,8,7,9,0};
        s.heapSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
