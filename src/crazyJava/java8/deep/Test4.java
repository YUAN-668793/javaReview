package crazyJava.java8.deep;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/** 在lambda表达式中加入多个Predicate
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 11/1/2018 7:25 PM
 */
public class Test4 {
    public static void main(String[] args) {
        //Predicate适合用于做过滤
        List languages = Arrays.asList("Java","Scala","C++","PHP");
        Predicate<String> startsWithJ = (n)->n.startsWith("J");
        Predicate<String> fourLetterLong = (n)->n.length() == 4;
        languages.stream().filter(startsWithJ.and(fourLetterLong)).
                forEach((n)-> System.out.println("nName, which starts with 'J' and four letter long is: "+n));

        System.out.println("========================");

        List<String> costBeforeTax = Arrays.asList("abc","bcd","defg","jk");
        List<String> filtered = costBeforeTax.stream().filter(x->x.length()>2).collect(Collectors.toList());
        filtered.forEach(n-> System.out.println(n));
    }
}
