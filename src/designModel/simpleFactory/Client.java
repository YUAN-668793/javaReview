package designModel.simpleFactory;

/** 简单工厂模式
 * 将业务和界面分离，注意将公共类似的部分抽象出来，让子类去继承，并重写指定方法
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/4/2018 3:14 PM
 */
public class Client {
    public static void main(String[] args) throws Exception{
        Operation oper = null;
        oper = OperationFactory.createOperate("-");
        oper.set_numberA(2);
        oper.set_numberB(5);
        System.out.println(oper.getResult());
    }
}
