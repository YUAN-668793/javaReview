package crazyJava.java8.deep;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/** 在lambda表达式中加入多个Predicate
 * Predicate适合用于做过滤
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 11/1/2018 7:25 PM
 */
public class Test4 {
    public static void main(String[] args) {
        List languages = Arrays.asList("Java","Scala","C++","PHP");
        Predicate<String> startsWithJ = (n)->n.startsWith("J");
        Predicate<String> fourLetterLong = (n)->n.length() == 4;
        languages.stream().filter(startsWithJ.and(fourLetterLong)).
                forEach((n)-> System.out.println("nName, which starts with 'J' and four letter long is: "+n));
    }
}
