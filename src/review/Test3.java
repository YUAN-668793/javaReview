package review;

import java.util.stream.IntStream;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/12 10:04
 */
public class Test3 {
    public static void main(String[] args) {
        IntStream is = IntStream.builder().add(20).add(13).add(-2).add(18).build();
        //下面聚集代码只能执行一次
        //System.out.println("is所有元素的最大值："+is.max().getAsInt());
        //System.out.println("is所有元素的最小值："+is.min().getAsInt());
        // System.out.println("is所有元素的总和："+is.sum());
        //System.out.println("is所有元素的平均值："+is.average());
        //System.out.println("is所有元素的平方是否都大于20："+is.allMatch(ele->ele*ele>20));
        //System.out.println("is是否包含任何元素的平方都大于20："+is.anyMatch(ele->ele*ele>20));
        //将is映射成一个新Stream,新Stream的每个元素都是原Stream的2倍加1
        IntStream newIs = is.map(ele->ele*2+1);
        newIs.forEach(System.out::println);
    }
}
