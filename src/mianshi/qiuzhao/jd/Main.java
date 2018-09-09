package mianshi.qiuzhao.jd;

import java.util.Scanner;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/9/2018 7:53 PM
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //数据组数
        int n = sc.nextInt();
        String[] arr ;
        String[]  result = new String[n];
        for(int i=0;i<n;i++){
            //N个点
            int N = sc.nextInt();
            //M条边
            int M = sc.nextInt();
            arr = new String[M];

            //存储的数据
            String data;
            for(int j=0;j<M;j++){
                data = "";
                data = sc.nextInt()+"=";
                data = data+sc.nextInt();
                arr[j] = data;
            }
            //获取第n组数据
            for(int j=0;j<M;j++){
                for(int k = j;k<M;k++){
                    if(arr[j].charAt(0) == arr[k].charAt(0) && arr[j].charAt(2) == arr[k].charAt(2) ){
                        result[i] = "yes";
                    }else{
                        result[i] = "no";
                    }
                }

            }

        }
        for(String getResult:result){
            System.out.println(getResult);
        }
    }
}
