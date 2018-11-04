package crazyJava.java8.deep;

import java.util.Optional;

/** Java8中的Optional类的解析
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 11/4/2018 6:20 PM
 */

//这是一个可以为 null 的容器对象。如果值存在则 isPresent() 方法会返回 true ，
// 调用 get() 方法会返回该对象。
public class Test7 {
    public static void main(String[] args) {
        //调用工厂方法创建Optional实例
        Optional<String> name = Optional.of("Sanulla");
        //传入参数为null，抛出NullPointException
       // Optional<String> someNull = Optional.of(null);
        //可以接受值为null的情况
        Optional<String> someNull = Optional.ofNullable(null);
        //判断是否有值
        if(name.isPresent()){
            System.out.println(name.get());
            //System.out.println(someNull.get());
        }

        //如果Optional实例有值则为其调用consumer，否则不做处理
        name.ifPresent((value)->{
            System.out.println("The length of the value is :"+value.length());
        });

        //如果Optional实例有值则将其返回，否则返回orElse方法传入的参数
        System.out.println(name.orElse("There is no value present!"));
        System.out.println(someNull.orElse("There is some value!"));

        //如果有值则将其返回，否则返回指定的其它值
        System.out.println(name.orElseGet(()->"Default Value"));
        System.out.println(someNull.orElseGet(()->"Default Value"));

        //如果有值则将其返回，否则抛出supplier接口创建的异常
        try {
            name.orElseThrow(Exception::new);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //map方法通过传入的lambda表达式修改Optional实例默认值
        name.map((value)->value.toUpperCase());

        //用filter方法检查是否满足给定条件
        System.out.println(name.filter((value)->value.length()>6));

    }
}
