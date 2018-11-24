package framework.reflect;

import java.lang.reflect.InvocationTargetException;

/** 带构造参数类反射
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 11/24/2018 11:03 AM
 */
public class ReflectServiceImp {
    private String name;

    public ReflectServiceImp(){}

    public ReflectServiceImp(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("hello "+name);
    }

    public static ReflectServiceImp getInstance(){
        ReflectServiceImp object = null;
        try{
            object = (ReflectServiceImp) Class.forName("framework.reflect.ReflectServiceImp").getConstructor(String.class).
                    newInstance("test");
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException
                | SecurityException | IllegalArgumentException | InvocationTargetException ex){
            ex.printStackTrace();
        }
        object.sayHello();
        return object;
    }

    public static void main(String[] args) {
         ReflectServiceImp.getInstance();
    }
}
