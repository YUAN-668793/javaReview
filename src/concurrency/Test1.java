package concurrency;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/1 11:13
 */
public class Test1 {

    private final AtomicLong count = new AtomicLong(0);


    private int value;
    /** 返回一个唯一的数值 .*/
    @Test
    public void getValue1(){
        count.incrementAndGet();
        Integer result = value++;
        System.out.println(result);
        //return result;
    }

    public synchronized void getValue2(){
        Integer result = value++;
        System.out.println(result);
        //return result;
    }
}
