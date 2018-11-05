package online.juejin.article2;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/** AtomicInteger常见方法使用
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 11/5/2018 7:22 PM
 */
public class Test3 {
    public static void main(String[] args) {
        int temvalue = 0;
        AtomicInteger i = new AtomicInteger(0);
        temvalue = i.getAndSet(3);
        System.out.println("temvalue:"+temvalue+"; i :"+i);
        temvalue = i.getAndIncrement();
        System.out.println("temvalue:"+temvalue+"; i :"+i);
        temvalue = i.getAndAdd(5);
        System.out.println("temvalue:"+temvalue+"; i :"+i);

        int[] num = {1,2,3,4,5,6,7,8,9,10};
        AtomicIntegerArray array = new AtomicIntegerArray(num);
        Arrays.asList(array).stream().forEach(n-> System.out.println(n));
    }
}
