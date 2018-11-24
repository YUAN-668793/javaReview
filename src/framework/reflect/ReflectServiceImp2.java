package framework.reflect;

import java.lang.reflect.InvocationTargetException;

/** 带构造参数类反射
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 11/24/2018 11:03 AM
 */
public class ReflectServiceImp2 {
    private String name;

    public ReflectServiceImp2(){}

    public ReflectServiceImp2(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("hello "+name);
    }

    public static ReflectServiceImp2 getInstance(){
        ReflectServiceImp2 object = null;
        try{
            object = (ReflectServiceImp2) Class.forName("framework.reflect.ReflectServiceImp2").getConstructor(String.class).
                    newInstance("test");
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException
                | SecurityException | IllegalArgumentException | InvocationTargetException ex){
            ex.printStackTrace();
        }
        object.sayHello();
        return object;
    }

    public static void main(String[] args) {
         ReflectServiceImp2.getInstance();
    }
}
