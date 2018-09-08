package mianshi.qiuzhao.wangyi;

import java.util.Scanner;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/8/2018 3:00 PM
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //定义扫描字符串时的位置
        int point = 0;
        //最长序列长度
        int maxSize = 0;
        //最终结果长度
        int result = 0;
        //临时处理字符串
        String temp = str;
        for(int i=0;i<str.length()-1;i++){
            //如果满足黑白相间
            if(temp.charAt(i) != temp.charAt(i+1)){
                //则长度加1（）
                maxSize ++;   //（最终结果记得加1）
                point = i;
                if(maxSize>result){
                    result = maxSize;
                }
                continue;
            }else{
                //若不满足黑白相间
                //将结果长度与结论进行比较，若大则赋值
                if(maxSize>result){
                    result = maxSize;
                }
                //maxSize重新计数
                maxSize = 0;
            }
        }
        System.out.println(result+1);
    }
}
