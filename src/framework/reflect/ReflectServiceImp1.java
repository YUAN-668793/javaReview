package framework.reflect;

import org.junit.Test;

/** 无构造参数类反射
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 11/24/2018 10:55 AM
 */
public class ReflectServiceImp1 {
    public void sayHello(String name){
        System.out.println("Hello "+name);
    }

    @Test
    public void getInstance(){
        ReflectServiceImp1 object = null;
        try{
            object = (ReflectServiceImp1) Class.forName("framework.reflect.ReflectServiceImp1").newInstance();
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException ex){
            ex.printStackTrace();
        }
        object.sayHello("test");
       // return object;
    }

}
