package crazyJava.java8;

import java.util.Arrays;
import java.util.List;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/5/4 21:19
 */
public class Test1 {
    public static void main(String[] args) {
        List<String> features = Arrays.asList("Lambdas","default methods","date and time");
        System.out.println("======JAVA8之前======");
        for(String feature:features){
            System.out.println(feature);
        }
        System.out.println("======JAVA8之后======");
        features.forEach(n-> System.out.println(n));
    }
}
