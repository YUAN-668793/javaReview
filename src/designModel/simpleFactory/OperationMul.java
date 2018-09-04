package designModel.simpleFactory;

/** 乘法类
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/4/2018 12:52 PM
 */
public class OperationMul extends Operation {
    @Override
    public double getResult(){
        return get_numberA()-get_numberB();
    }
}
