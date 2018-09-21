package mianshi.jianzhiOffer;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/21/2018 3:46 PM
 */

/**
 * 题目描述
 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非减排序的数组的一个旋转，
 输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */

/**
 * 思路：
 * 最笨做法，直接查找
 * 最好采用二分搜索
 */
public class Test6 {
    public int minNumberInRotateArray(int [] array) {
        int len = array.length;
        if(len == 0){
            return 0;
        }
        if(len == 1){
            return array[0];
        }
        int min = array[0];
        for(int i=0;i<len;i++){
            if(min>array[i]){
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        int[] a = {3,4,5,1,2};
        int result = t.minNumberInRotateArray(a);
        System.out.println(result);
    }
}
