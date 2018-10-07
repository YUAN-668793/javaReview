package mianshi.jianzhiOffer;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 10/7/2018 3:03 PM
 */

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Test11 {
    public int numberOf1(int n) {
        int k = 0;
        char[] arr = Integer.toBinaryString(n).toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == '1'){
                k++;
            }
        }
        return k;
    }
}
