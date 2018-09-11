package test.myTest;

/**
 * Created by Jiayuan on 2018/3/7.
 */
public class Test05 {
    public static void main(String[] args) {
        String str1 = new String("str1");
        String str2 = new String("str1");
        String str3 = "str3";
        String str4 = "str3";
        System.out.println(str3 == str4);
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
