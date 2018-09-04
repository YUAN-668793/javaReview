package designModel.decorate;

/** 具体对象操作
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/4/2018 4:20 PM
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("具体操作");
    }
}
