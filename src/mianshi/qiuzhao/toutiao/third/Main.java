package mianshi.qiuzhao.toutiao.third;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/20/2018 8:33 PM
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        List<String> reds = new ArrayList<>();
        List<String> blues = new ArrayList<>();
        List<String> greens = new ArrayList<>();
        String[] result = new String[n+m+k];
        for(int i=0;i<n;i++){
            reds.add("r");
        }
        for(int i=0;i<m;i++){
            blues.add("b");
        }
        for(int i=0;i<k;i++){
            greens.add("g");
        }
        //总数
        int total = n+m+k;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int g=0;g<k;g++){

                }
            }
        }
    }
}
