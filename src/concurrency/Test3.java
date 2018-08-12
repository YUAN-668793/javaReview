package concurrency;

import org.junit.Test;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/2 9:14
 */

//与Test2关联
public class Test3 extends Test2{
    @Test
    public synchronized void doSomething(){
        System.out.println(toString()+":calling doSomething");
        super.doSomething();
    }
}
