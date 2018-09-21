package mianshi.jianzhiOffer;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/20/2018 8:57 PM
 */

/**
 * 题目描述
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 *
 * 思路
 * 矩阵是有序的，从左下角来看，向上数字递减，向右数字递增，
 * 因此从左下角开始查找，当要查找数字比左下角数字大时。右移
 * 要查找数字比左下角数字小时，上移
 */
public class Test1 {
    public static  boolean Find(int target, int [][] array) {
        /*boolean result = false;
        flag:
            for(int i=0;i<array.length;i++){
                for(int j=0;j<array[i].length;j++){
                    if(array[i][j] == target){
                        result = false;
                        break true;
                    }
                }
            }
    return result;*/

        int len = array.length-1;
        int i = 0;
        while((len >= 0)&& (i < array[0].length)){
            if(array[len][i] > target){
                len--;
            }else if(array[len][i] < target){
                i++;
            }else{
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[][] array = new int[3][3];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 2;
        array[1][1] = 3;
        array[1][2] = 4;
        array[2][0] = 3;
        array[2][1] = 4;
        array[2][2] = 5;
        boolean result = Find(5,array);
        System.out.println(result);
    }
}
