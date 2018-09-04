package bishi;

import java.util.Scanner;

/** 输入输出
 *  测试第一个为n，连续输入n个数并获取值
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/4/2018 6:22 PM
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        Integer times = Integer.parseInt(sc.next());
        System.out.println("次数"+times);
        for(int i=0;i<times;i++){
            result += sc.next()+"==";
        }
        System.out.println(result);
    }
}
