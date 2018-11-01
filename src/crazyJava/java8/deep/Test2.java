package crazyJava.java8.deep;

import java.util.Arrays;
import java.util.List;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 11/1/2018 3:42 PM
 */
public class Test2 {
    public static void main(String[] args) {
        //Java8之前
        List<String> features1 =  Arrays.asList("Lambdas","default Method","streamAPI","Date and Time");
        for(String feature:features1){
            System.out.println(feature);
        }
        System.out.println("====================================");
        //Java8之后
        List<String> features2 =  Arrays.asList("Lambdas","default Method","streamAPI","Date and Time");
        features2.forEach(n-> System.out.println(n));
    }
}
