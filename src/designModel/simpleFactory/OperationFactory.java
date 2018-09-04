package designModel.simpleFactory;

/** 运算类工厂
 * 根据传入的运算符参数决定要实例化哪一个子类，由于存在继承关系，统一用其父类类型接收
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/4/2018 12:46 PM
 */
public class OperationFactory {
   public static Operation createOperate(String operate){
       Operation oper = null;
       switch (operate){
           case "+":
               oper = new OperstionAdd();
               break;
           case "-":
               oper = new OperationSub();
               break;
           case "*":
               oper = new OperationMul();
               break;
           case "/":
               oper = new OperationDiv();
               break;
       }return oper;
   }
}
