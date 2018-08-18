package sort.Network;

/** 希尔排序(递减增量排序算法)，分组后进行插入排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/15 19:02
 */
public class Sort2 {
    public void sheelSort(int[] a){
        int len = a.length;    //单独把数组长度拿出来，提高效率
        while(len!=0){
            len = len/2;
            for(int i=0;i<len;i++){    //分组
                for(int j = i+len;j<a.length;j+=len){  //元素从第二个开始
                    int k = j-len;    //k为有序序列最后一位的位数
                    int temp = a[j];  //要插入的元素
                    while(k>=0 && temp<a[k]){
                        a[k+len] = a[k];
                        k-=len;
                    }
                    a[k+len] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{4,2,1,5,7,8,3,6,9};
        Sort2 s = new Sort2();
        s.sheelSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
