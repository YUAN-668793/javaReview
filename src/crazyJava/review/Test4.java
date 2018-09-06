package review;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/12 10:27
 */
public class Test4 {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add(new String("Java EE"));
        books.add(new String("php"));
        books.add(new String("Ajax"));
        books.add(new String("IOS"));
        System.out.println(books.stream().filter(ele->((String)ele).contains("a")).count());
        System.out.println(books.stream().filter(ele->((String)ele).contains("p")).count());
        books.stream().mapToInt(ele->((String)ele).length()).forEach(System.out::println);
    }
}
