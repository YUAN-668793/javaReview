package myTest;

import java.util.*;

/**
 * Created by Jiayuan on 2018/3/9.
 */
public class Test11 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        Queue<String> queue2 = new LinkedList<String>();
        ArrayList<String> a = new ArrayList<String>();
        new Runnable(){

            @Override
            public void run() {
                System.out.println("run method");

            }
        };
        //往a队列添加元素
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        System.out.print("进栈：");
        //a队列依次添加进List集合中
        for(String q:queue){
            a.add(q);
            System.out.print(q);
        }
        //以倒序的方法取出
        for(int i = a.size()-1;i>=0;i--){
            queue2.offer(a.get(i));
        }
        //打印出栈队列

        System.out.print("出栈：");
        for(String q:queue2){
            System.out.print(q);
        }
    }
}
