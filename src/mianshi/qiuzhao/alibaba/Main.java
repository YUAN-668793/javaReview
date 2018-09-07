package mianshi.qiuzhao.alibaba;

import java.util.Scanner;

/**alibaba-arrayDepart
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/7/2018 7:30 PM
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //组合结果数
        int result;
        //拆分组数
        int total;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(arr.length<6){
            //若小于6.则不存在拆分，返回一个子数组（即本身）
            result = 1;
            System.out.println(result);
        }else{
            //若大于6
            //若数组长度为3的整数倍，则最多可以拆解成arr.length/3个子数组
            if(arr.length %3 == 0){
                //
            }
        }

    }
}
