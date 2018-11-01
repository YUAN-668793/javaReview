package crazyJava.java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/7/31 16:13
 */
public class Test2 {
    @Test
    public void test1(){
        //before Java8
        List<Integer> costBeforeTax = Arrays.asList(100,200,300,400,500);
        for(Integer cost:costBeforeTax){
            double price = cost + .12*cost;
            System.out.println(price);
        }
    }
    @Test
    public void test2(){
        //use java8  lambda expression
        List<Integer> costBeforeTax = Arrays.asList(100,200,300,400,500);
        costBeforeTax.stream().map((cost)->cost+.12*cost).forEach(System.out::println);
    }

    public void test3(){
        // new method : to merge all values to one
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        double bill = costBeforeTax.stream().map((cost) -> cost + .12*cost)
                .reduce((sum, cost) -> sum + cost).get();
        System.out.println("Total : " + bill);
    }

   /* public void test4(){
        // 创建一个字符串列表，每个字符串长度大于 2
        List costBeforeTax = Arrays.asList("abc","bcd","defg","jk");
        List<String> filtered = strList.stream().filter(x -> x.length()> 2).collect(Collectors.toList()); System.out.printf("Original List : %s, filtered list : %s %n", strList, filtered);
    }*/
}
