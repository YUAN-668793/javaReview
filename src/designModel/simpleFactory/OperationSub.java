package designModel.simpleFactory;

/** 减法类
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/4/2018 12:51 PM
 */
public class OperationSub extends Operation {
    @Override
    public double getResult(){
        return get_numberA()-get_numberB();
    }
}
