package designModel.simpleFactory;

/** 除法类
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/4/2018 12:52 PM
 */
public class OperationDiv extends Operation{
    @Override
    public double getResult() throws Exception {
        if(get_numberB() == 0){
            throw new Exception("除数不能为0");
        }
        return get_numberA()/get_numberB();
    }
}
