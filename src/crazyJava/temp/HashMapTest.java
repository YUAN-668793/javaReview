package crazyJava.temp;

import java.util.*;

/**Map集合中元素排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/19/2018 8:49 PM
 */

/**
 * 已知一个HashMap<Integer，User>集合， User有name（String）和 age（int）属性。请写一个方法实现对
 HashMap 的排序功能，该方法接收 HashMap<Integer，User>为形参，返回类型为 HashMap<Integer，User>，
 要求对HashMap中的User的age倒序进行排序。排序时key=value键值对不得拆散。
 注意：要做出这道题必须对集合的体系结构非常的熟悉。HashMap 本身就是不可排序的，但是该道题偏偏让给
 HashMap排序，那我们就得想在API中有没有这样的Map结构是有序的，LinkedHashMap，对的，就是他，他是
 Map结构，也是链表结构，有序的，更可喜的是他是HashMap的子类，我们返回LinkedHashMap<Integer,User>
 即可，还符合面向接口（父类编程的思想）。
 但凡是对集合的操作，我们应该保持一个原则就是能用JDK中的API就有JDK中的API，比如排序算法我们不应
 该去用冒泡或者选择，而是首先想到用Collections集合工具类。
 1
 */
public class HashMapTest {
    static class User{
        String name;
        int age;
        public User(String name,Integer age){
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
    public static void main(String[] args) {
        HashMap<Integer,User> users = new HashMap<>();
        users.put(1,new User("张三",25));
        users.put(2,new User("李四",22));
        users.put(3,new User("王五",28));
        HashMap<Integer,User> sortHashMap = sortHashMap(users);
        System.out.println(sortHashMap);
    }

    private static HashMap<Integer,User> sortHashMap(HashMap<Integer, User> map) {
        Set<Map.Entry<Integer,User>> entrySet = map.entrySet();
        List<Map.Entry<Integer,User>> list = new ArrayList<>(entrySet);
        Collections.sort(list, new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
                return o2.getValue().getAge() - o1.getValue().getAge();
            }
        });
        LinkedHashMap<Integer,User> linkedHashMap = new LinkedHashMap<>();
        for(Map.Entry<Integer,User> entry:list){
            linkedHashMap.put(entry.getKey(),entry.getValue());
        }
        return linkedHashMap;
    }
}
