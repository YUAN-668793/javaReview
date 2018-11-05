package online.juejin.article2;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.*;

/** 创建线程池，原子类
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 11/5/2018 3:56 PM
 */
public class Test1 {
    public static void main(String[] args) {
        //1.通过构造方法创建，只能通过ThreadPoolExecutor！
        //new ThreadPoolExecutor();
        //2.通过Executors工具类创建
        //该方法返回一个可根据实际情况调整线程数量的线程池
        Executors.newCachedThreadPool();
        //方法返回一个只有一个线程的线程池
        Executors.newSingleThreadExecutor();
        //该方法返回一个固定线程数量的线程池
        Executors.newFixedThreadPool(10);

        //基本类型，应用类型对应的原子类

        //整型原子类，长整型原子类，布尔型原子类，使用原子的方式更新基本类型
        AtomicInteger a = new AtomicInteger(123);
        AtomicLong b = new AtomicLong(123);
        AtomicBoolean c = new AtomicBoolean(true);

        //数组类型，使用原子的方式更新数组里的某个元素
        AtomicIntegerArray a1 = new AtomicIntegerArray(5);
        AtomicLongArray b1 = new AtomicLongArray(5);
        AtomicReferenceArray d1 = new AtomicReferenceArray(1);

        //引用类型
        //引用类型原子类
        AtomicReference e = new AtomicReference(5);
        AtomicStampedReference f = new AtomicStampedReference(new Object(),5);
        AtomicMarkableReference g = new AtomicMarkableReference(new Object(),true);

        //常用方法
        //使用AtomicInteger之后，不需要对该方法加锁，也可以实现线程安全。
        a.get();
        a.getAndSet(124);
        a.getAndIncrement();
        a.getAndDecrement();
        a.getAndAdd(6);
        a.compareAndSet(128,129);
        a.lazySet(666);


    }
}
