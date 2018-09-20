package mianshi.qiuzhao.toutiao.second;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/20/2018 7:21 PM
 * <p>
 * 5
  bytedance
  toutiaohao
  toutiaoapp
  iesaweme
  iestiktok
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        List<String> result = new ArrayList<>();
        int times = sc.nextInt();
        String input = null;
        //判断是否有处理相同的字符串
        boolean deal = false;
        //将输入的字符串存入list中
        for (int i = 0; i < times; i++) {
            input = sc.next();
            list.add(input);
        }
        String last = "";
        //循环比较
        for(int j=0;j<list.size()-1;j++){
            //选取短的字符串作为内部比较次数,防止处理字符串时越界
            int len = Math.min(list.get(j).length(),list.get(j+1).length());
            for(int k=0;k<len-1;k++){
                //如果相同位置的字符串不匹配
                //System.out.println(list.get(j).charAt(k) +"=="+ list.get(j+1).charAt(k));
                if(!(list.get(j).charAt(k) == list.get(j+1).charAt(k))){
                    //记录下此时k的位置,并截取公共字符串+1
                    last = list.get(j).substring(0,k+1);
                    result.add(last);
                    deal = true;
                    break;
                }
            }
            //若没有公共部分，则添加第一个字母
            if(deal == false){
                result.add(String.valueOf(list.get(j).charAt(0)));
            }
        }
        result.add(last);
        System.out.println(result);
    }

}