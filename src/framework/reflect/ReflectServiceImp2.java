package framework.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/** 反射方法
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 11/24/2018 11:03 AM
 */
public class ReflectServiceImp2 {

    public void sayHello(String name){
        System.out.println("hello "+name);
    }

    public  Object reflectMethod(){
        Object returnObj = null;
        ReflectServiceImp2 target = new ReflectServiceImp2();
        try{
            Method method = ReflectServiceImp2.class.getMethod("sayHello",String.class);
            returnObj = method.invoke(target,"test");
        }catch(NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException |
                InvocationTargetException ex){
            ex.printStackTrace();
        }
        return returnObj;
    }

    public static void main(String[] args) {
       new ReflectServiceImp2().reflectMethod();
    }
}
