package mianshi.qiuzhao.toutiao.first;

import java.util.Scanner;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/20/2018 6:53 PM
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //获取路径
        String path = sc.next();
        if(path.length() <=1 && path.contains("/") ){
            System.out.println("");
            return ;
        }
        if(!path.contains("/")){
            System.out.println("");
            return;
        }
        //查找最后一个"/"的位置
        int i = path.lastIndexOf("/");
        //若为最后一个位置
        if(i == path.length()-1){
            //则截掉它
            path = path.substring(0,i);
        }
        //重新查找最后一个"/"的位置
        i = path.lastIndexOf("/");
        if(i == -1){
            System.out.println("");
            return;
        }
        String result = path.substring(i,path.length());
        System.out.println(result);
    }
}
