package algorithms.sort.thought;

/** 简单选择排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/15 21:36
 */

/**
 * 思想：
 * 设定循环次数，和当前数字和当前位置
 * 将当前位置的数和后面所有的数进行对比，小的数赋值给min，并记住小数的位置
 * 对比完成后，将最小的值与第一个数交换
 * 循环到最后
 *
 */
public class Select {

    public void selectSort(int[] a){
        int len = a.length;
        for(int i=0;i<len;i++){    //循环比较的次数·
            int min = a[i];        //设置当前位置的值为最小值
            int position = i;           //要交换的值的位置
            for(int j = i;j<len;j++){    //与后面的值进行比较
                if(min>a[j]){       //如果存在比min更小的值，则赋值给min
                    min = a[j];
                    position = j;
                }
            }
            a[position] = a[i];
            a[i] = min;
        }
    }

    public static void main(String[] args) {
        Select s = new Select();
        int[] a = new int[]{4,5,1,2,7,8,9,3,0};
        s.selectSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
