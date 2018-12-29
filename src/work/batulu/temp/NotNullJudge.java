package work.batulu.temp;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangjiayuan@qipeipu.com
 * @date 2018/12/28 15:17
 * @since 1.0.0
 */
public class NotNullJudge {
    public static  List<String> returnNotNull(Object object){
        List<String> fieldList = new ArrayList<String>();
        if(object != null){
            Class<?> clz = object.getClass();
            Field[] fields = clz.getDeclaredFields();
            for(Field field:fields){
                try {
                    Method method = object.getClass().getMethod(field.getName(),String.class);
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
                System.out.println(field.getName());
            }
        }
        return null;
    }
    public static void main(String[] args) {
        User user = new User("zhangsan","123",null);
        returnNotNull(user);
    }
}
