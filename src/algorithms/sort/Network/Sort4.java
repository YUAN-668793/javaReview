package sort.Network;

/** 堆排序(暂时先不做)
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/15 20:07
 */
public class Sort4 {

    public void headSort(int[] a){
        int len = a.length;
        //循环建堆
        for(int i=0;i<len-1;i++){
            //建堆
            buildMaxHeap(a,len-1-i);
            //交换堆顶和最后一个元素
            swap(a,0,len-1-i);
        }
    }

    //交换方法
    public void swap(int[] data,int i,int j){
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    //对data数组从0到lastIndex建大顶堆
    public void buildMaxHeap(int[] data,int lastIndex){
        //从lastIndex处结点（最后一个结点）的父节点开始
        for(int i = (lastIndex-1)/2;i>=0;i--){
            //k保存正在判断的结点
            int k=i;
            //如果当前k结点的子结点存在
            while(k*2+1<=lastIndex){

            }
        }
    }
}
