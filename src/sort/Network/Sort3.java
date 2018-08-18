package sort.Network;

/** 简单选择排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/15 19:43
 */
public class Sort3 {
    public void selectSort(int[] a){
        int len = a.length;
        for(int i=0;i<len;i++){   //循环次数
            int value = a[i];
            int position = i;
            for(int j=i+1;j<len;j++){  //找到最小的值和位置
                if(a[j]<value){
                    value = a[j];
                    position = j;
                }
            }
            a[position] = a[i];   //进行交换
            a[i] = value;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{4,2,1,5,7,8,3,6,9};
        Sort3 s = new Sort3();
        s.selectSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
