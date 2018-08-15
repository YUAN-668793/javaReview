package blog;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/13 9:09
 */
public class Test1 {
    //https://mp.weixin.qq.com/s/wNmAi1FICNu7rkmCe1GDyw
    //HashMap底层是数组+链表
    //强烈建议使用第一种 EntrySet 进行遍历。
    //第一种可以把 key value 同时取出，第二种还得需要通过 key 取一次 value，效率较低。
    public void iterator1(){
        Map<String,Integer> map = new HashMap<>();
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            System.out.println("key="+next.getKey()+"  "+"value="+next.getValue());
        }
    }

    public void iterator2(){
        Map<String,Integer> map = new HashMap<>();
        Iterator<String> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println("key="+key+"  "+"value="+map.get(key));
        }
    }

    public static void main(String[] args) {

    }
}
