package thread.threadDemo;

import java.util.*;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/5/1 18:59
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //线程安全的类
        StringBuffer sb = new StringBuffer();
        Vector<String> v = new Vector<String>();
        Hashtable<String,String> ht = new Hashtable<String,String>();

        List<String> list1 = new ArrayList<>();    //非线程安全
        List<String> list2 = Collections.synchronizedList(new ArrayList<>()); //线程安全
    }
}
