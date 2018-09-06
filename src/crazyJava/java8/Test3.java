package java8;

import org.junit.Test;

import java.util.Optional;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/7/31 16:29
 */
public class Test3 {
    @Test
    public void test1(){
        //调用工厂方法创建 Optional 实例
        Optional<String> name = Optional.of("Sanaulla");
        //传入参数为 null，抛出 NullPointerException.
        //Optional<String> someNull = Optional.of(null);
        //下面创建了一个不包含任何值的 Optional 实例
        // 例如，值为'null'
        Optional empty = Optional.ofNullable(null);
        if(name.isPresent()){
            System.out.println(name.get());
        }
    }

}
