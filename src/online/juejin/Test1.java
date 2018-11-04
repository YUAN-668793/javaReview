package online.juejin;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** 流的常见构造方式
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 11/4/2018 3:08 PM
 */
public class Test1 {
    public static void main(String[] args) {
        Stream stream = Stream.of("H","E","L","L","0");
        String[] strArray = new String[]{"H","E","L","L","0"};
        stream = Stream.of(strArray);
        stream = Arrays.stream(strArray);
        List<String> list = Arrays.asList(strArray);
        stream = list.stream();

        //流操作

        //map操作可以改变对象的内容或类型，生成一个一对一的映射，每个输入元素，
        // 都按照规则转换成为另外一个元素。比如把大写字母转换成小写。
        List<String> wordList = Arrays.asList("H","E","L","L","0");
        List<String> outputList = wordList.stream().map(String::toLowerCase).collect(Collectors.toList());


    }
}
