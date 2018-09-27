package mianshi.qiuzhao.mogujie.second;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String dict = sc.next();
        s = s.substring(3, s.length() - 1);
        dict = dict.substring(6, dict.length() - 1);
        String[] split = dict.split(",");
        int len = split.length;
        int lens = s.length();
        for(int i=0;i<len;i++){
            String temp = "";
            String result = "";
            for(int j=0;j<lens;j++){
                temp+=s.charAt(j);
                if(temp.length()>0 && temp.equals(split[i])){
                   // result = temp

                }
            }
        }
    }
}
