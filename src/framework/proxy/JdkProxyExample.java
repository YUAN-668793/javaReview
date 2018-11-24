package framework.proxy;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/** JDK动态代理
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 11/24/2018 7:21 PM
 */
public class JdkProxyExample implements InvocationHandler {

    //真实对象
    private Object target = null;

    /**
     * 处理代理对象和真实对象的代理关系，并返回代理对象
     * @param target
     * @return  代理对象
     */
    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }
    /**
     * 代理方法逻辑
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入代理逻辑方法");
        System.out.println("在调度真实对象之前的服务");
        Object object = method.invoke(target,args);
        System.out.println("在调度真实对象之后的服务");
        return object;
    }

    @Test
    public void testJdkProxy(){
        JdkProxyExample jdk = new JdkProxyExample();
        //绑定关系，因为挂在接口HelloWorld下，所以声明代理对象HelloWorld proxy
        HelloWorld proxy = (HelloWorld)jdk.bind(new HelloWorldImpl());
        //注意，此时HelloWorld对象已经是一个代理对象，它会进入代理的逻辑方法invoke里
        proxy.sayHelloWorld();
    }
}
