package online.juejin.article2;

import online.juejin.temp.People;

import java.util.concurrent.atomic.AtomicReference;

/** AtomicReference 类使用
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 11/5/2018 7:52 PM
 */
public class Test4 {
    public static void main(String[] args) {
        AtomicReference<People> ar = new AtomicReference<People>();
        People people = new People("tom",20);
        ar.set(people);
        People people1 = new People("saly",19);
        ar.compareAndSet(people,people1);
        System.out.println(ar.get().getName());
        System.out.println(ar.get().getAge());
    }
}
