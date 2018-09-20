package mianshi.qiuzhao.toutiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/20/2018 4:31 PM
 */
public class Main {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        //a b c a b c b b
        int maxLength = 1;
        List<Character> list = new ArrayList<Character>();
        //通过list来存取字符串
        list.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (list.contains(s.charAt(i))) {
                int index = list.indexOf(s.charAt(i));
                list = list.subList(index + 1, list.size());
                list.add(s.charAt(i));
//				System.out.println(list);
                maxLength = Math.max(maxLength, list.size());
            } else {
                list.add(s.charAt(i));
                maxLength = Math.max(maxLength, list.size());
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //获取字符串
        String str = sc.next();
        Main m = new Main();
        int result = m.lengthOfLongestSubstring(str);
        System.out.println(result);
    }
}
