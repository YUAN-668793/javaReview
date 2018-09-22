package mianshi.niukewang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/** 数串
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/5/2018 9:22 PM
 */

/**
 * 题目描述
 设有n个正整数，将他们连接成一排，组成一个最大的多位整数。
 如:n=3时，3个整数13,312,343,连成的最大整数为34331213。
 如:n=4时,4个整数7,13,4,246连接成的最大整数为7424613。
 输入描述:
 有多组测试样例，每组测试样例包含两行，第一行为一个整数N（N<=100），第二行包含N个数(每个数不超过1000，空格分开)。
 输出描述:
 每组数据输出一个表示最大的整数。
 */

/**
 * https://www.nowcoder.com/practice/a6a656249f404eb498d16b2f8eaa2c60?tpId=85&&tqId=29898&rp=1&ru=/activity/oj&qru=/ta/2017test/question-ranking
 */
public class Main{

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);
            int[] arr = new int[n];
            line = br.readLine();
            String[] sarr = line.trim().split(" ");
            Arrays.sort(sarr, new Comparator<String>() {

                @Override
                public int compare(String o1, String o2) {
                    // TODO Auto-generated method stub
                    int size = o1.length() + o2.length();
                    for (int i = 0; i < size; i++) {
                        if (o1.charAt(i % o1.length()) > o2.charAt(i % o2.length())) {
                            return 1;
                        }
                        if (o1.charAt(i % o1.length()) < o2.charAt(i % o2.length())) {
                            return -1;
                        }
                    }
                    return 0;
                }

            });
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(sarr[i]);
            }
            System.out.println();
        }
    }
}