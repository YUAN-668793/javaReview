package review;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/12 9:36
 */
public class Test2 {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add(new String("Java EE"));
        books.add(new String("php"));
        books.add(new String("Ajax"));
        books.add(new String("IOS"));
        books.removeIf(ele -> ((String)ele).length()<4);
        System.out.println(books);

        System.out.println(calAll(books,ele->((String)ele).contains("a")));
    }

    //Prediacte过滤条件
    public static int calAll(Collection books, Predicate p){
        int total = 0;
        for(Object obj:books){
            //使用Predicate的test()方法判断该对象是否满足Predicate指定的条件
            if(p.test(obj)){
                total++;
            }
        }
        return total;
    }
}
