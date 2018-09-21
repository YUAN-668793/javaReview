package mianshi.jianzhiOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/21/2018 9:50 AM
 */

/**
 * 题目描述
 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 判断数组中是否含有该整数。
 */

/**
 * 思路：
 * 1.先查找出所有空格的位置，存入list集合中
 * 2.将索引指定的位置拼接指定字符串（20%），并添加字符串长度的偏移量，以便查找位置索引得到正确的结果
 * 3.将结果的空格去掉
 */
public class Test2 {
    public String replaceSpace(StringBuffer str) {
        int len = str.length();
        List<Integer> location = new ArrayList<>();
        for(int i=0;i<len;i++){
            if(str.charAt(i) == ' '){
                location.add(i);
            }
        }
        int offset = 0;
        StringBuffer join = new StringBuffer("%20");
        for(int j=0;j<location.size();j++){
            str.insert(location.get(j)+offset,join);
            offset+=join.length();
        }
        str = new StringBuffer(str.toString().replace(" ",""));;
        return str.toString();
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        StringBuffer str = new StringBuffer("  ") ;
        t.replaceSpace(str);
    }
}
