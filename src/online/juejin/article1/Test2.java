package online.juejin.article1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** flatmap提供一种一对多关系的映射
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 11/4/2018 6:54 PM
 */
public class Test2 {
    public static void main(String[] args) {
        List<String> hiList = Arrays.asList("hello","hi","你好");
        List<String> nameList =Arrays.asList("Ted","Bobo","Alice");
        hiList.stream().flatMap(hi -> nameList.stream().map(name -> hi + " " + name))
                .collect(Collectors.toList()).forEach(System.out::println);

        Integer[] nums = {0,1,2,3,4,5,6,7,8,9};
        Stream.of(nums).filter(n->(n&1)==1).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println(nameList.stream().mapToInt(String::length).max());
    }
}
