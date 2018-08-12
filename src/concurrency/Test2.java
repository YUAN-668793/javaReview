package concurrency;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/2 9:12
 */
//如果内置锁不上可重入的，那么，这段代码将发生死锁(与Test3关联)
public class Test2 {
    public synchronized void doSomething(){
        //...
    }
}
