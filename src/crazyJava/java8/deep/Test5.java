package crazyJava.java8.deep;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** Java 8中使用lambda表达式的Map和Reduce示例
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 11/4/2018 3:25 PM
 */
public class Test5 {
    public static void main(String[] args) {
        List<Integer> costBeforeTax = Arrays.asList(100,200,300,400,500);
        //不使用lambda表达式之前
        for(Integer cost:costBeforeTax){
            double price = cost + .12*cost;
            System.out.println(price);
        }
        System.out.println("=============================");
        //使用lambda表达式之后
        //map操作将lamdba表达式应用到（集合）流中的每一个元素
        costBeforeTax.stream().map((cost)->cost+.12*cost).forEach(System.out::println);

        //不使用lambda表达式之前
        double total = 0;
        for(Integer cost:costBeforeTax) {
            double price = cost+.12*cost;
            total = total+price;
        }
        System.out.println("Total："+total);

        //使用lambda表达式之后
        //reduce操作将集合流中的元素值进行合并，类似 average()、count()、sum()
        double bill = costBeforeTax.stream().map((cost)->cost+.12*cost).reduce((sum,cost)->sum+cost).get();
        System.out.println("Total："+bill);


        //练习：将字符串换成大写并用逗号连接起来
        List<String> G7 = Arrays.asList("USA","Japan","France","Germany","Italy","U.K","Canada");
        String G7Countries = G7.stream().map(x->x.toUpperCase()).collect(Collectors.joining(","));
        System.out.println(G7Countries);

        //使用流的distinct()方法来对集合进行去重
        List<Integer> numbers = Arrays.asList(9,10,3,4,7,3,4);
        List<Integer> distinct = numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());
        distinct.forEach(n-> System.out.print(n+","));

    }
}
