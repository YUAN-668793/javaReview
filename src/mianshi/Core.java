package mianshi;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/11 15:18
 */
class Fruid{
    private Core c;
    protected class Core{
        public Core(){
            System.out.println("Fruit.core()");
        }
    }
    public Fruid(){
        System.out.println("New Fruid()");
        c = new Core();
    }
}

class BigFruid extends Fruid{
    public class Core {
        public Core(){
            System.out.println("BigFruid Core()");
        }
    }
}

