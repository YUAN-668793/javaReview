package mianshi.temp;

import java.util.*;

/**MyTest
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/5/4 16:16
 */
public class Test {
    public static void main(String[] args) {
        HashMap<Integer,User> users = new HashMap<>();
        users.put(1,new User("张三",19));
        users.put(2,new User("李四",15));
        users.put(3,new User("王五",28));
        System.out.println(users);
        HashMap<Integer,User> sortMap = sort(users);
        System.out.println(sortMap);
    }
    public static LinkedHashMap<Integer,User> sort(HashMap<Integer,User> map){
        Set<Map.Entry<Integer,User>> entrySet = map.entrySet();
        List<Map.Entry<Integer,User>> list = new ArrayList<Map.Entry<Integer,User>>(entrySet);
        Collections.sort(list, new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
               return  o2.getValue().getAge()- o1.getValue().getAge();
            }
        });
        LinkedHashMap<Integer,User> linkedHashMap = new LinkedHashMap<Integer,User>();
        for(Map.Entry<Integer,User> entry:list){
                linkedHashMap.put(entry.getKey(),entry.getValue());
        }
        return linkedHashMap;
    }

}
