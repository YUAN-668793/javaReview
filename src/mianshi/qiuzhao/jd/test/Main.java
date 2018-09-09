package mianshi.qiuzhao.jd.test;

import java.util.Scanner;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/9/2018 7:57 PM
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        String data = "";
        for(int i=0;i<n;i++){
            data = "";
            data = sc.nextInt() +"=";
            data = data+sc.nextInt() +"=";
            data += sc.nextInt();
            arr[i] = data;
        }
        //不合格数
        int result = 0;
        //比较次数
        for(int i=0;i<n;i++){
            //每一个与后面的相比较
           inner: for(int j=i;j<n;j++){
                if(arr[i].charAt(0) <arr[j].charAt(0) && arr[i].charAt(2) <arr[j].charAt(2)
                        && arr[i].charAt(4) <arr[j].charAt(4)){
                    result++;
                    break  inner;
                }
            }
        }
        System.out.println(result);
    }
}
