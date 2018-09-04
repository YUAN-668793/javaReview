package designModel.decorate;

/** 装饰器
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/4/2018 4:22 PM
 */
public abstract class Decorator extends Component{
    protected Component component;
    public void setComponent(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        if(component != null){
            component.operation();
        }
    }
}
