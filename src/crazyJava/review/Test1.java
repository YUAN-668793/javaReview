package crazyJava.review;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/12 9:24
 */
public class Test1 {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add(1);
        books.add(2);
        books.add(3);
        books.forEach(obj-> System.out.println(obj));
        System.out.println("===========");
        Iterator it = books.iterator();
        it.forEachRemaining(obj-> System.out.println(obj));
    }
}
