package crazyJava.java8.deep;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/** 使用lambda表达式和函数式接口Predicate
 * @author Jiayuan
 * @version 1.0
 * @description:0
 * @time 11/1/2018 3:47 PM
 */
public class Test3 {
    public static void main(String[] args) {
        List languages = Arrays.asList("Java","Scala","C++","PHP");
        System.out.println("Language which starts with J:");
        filter(languages,(str)->(String.valueOf(str)).startsWith("J"));

        System.out.println("Language which starts with S:");
        filter(languages,(str)->(String.valueOf(str)).startsWith("S"));

        System.out.println("Print all languages");
        filter(languages,(str)->true);

        System.out.println("print no languages");
        filter(languages,(str)->false);

        System.out.println("Print languages whose length greater than 4");
        filter(languages,(str)->(String.valueOf(str)).length()>4);
    }

    public static void filter(List<String> names, Predicate condition){
       /* for(String name:names){
            if(condition.test(name)){
                System.out.println(name+" ");
            }
        }*/
       names.stream().filter((name)->(condition.test(name))).forEach((name)->{
           System.out.println(name+"");
        });
    }
}
