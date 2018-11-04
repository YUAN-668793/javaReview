package crazyJava.java8.deep;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/** 计算集合元素的最大值，最小值，总和以及平均值
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 11/4/2018 4:50 PM
 */
public class Test6 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2,3,5,7,11,17,19,23,29);
        IntSummaryStatistics stats = primes.stream().mapToInt((x)->x).summaryStatistics();
        System.out.println("highest prime number in List:"+stats.getMax());
        System.out.println("Lowest prime number in List:"+stats.getMin());
        System.out.println("Sum of all numbers:"+stats.getSum());
        System.out.println("Average of all prime numbers:"+stats.getAverage());
    }
}
