package designModel.simpleFactory;

/** 加法类
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/4/2018 12:49 PM
 */
public class OperstionAdd extends Operation {
    @Override
    public double getResult(){
        return get_numberA()+get_numberB();
    }
}
