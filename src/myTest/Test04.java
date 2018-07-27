package myTest;

/**
 * Created by Jiayuan on 2018/3/7.
 */
public class Test04  {
    private Test03 t3;
    private Test02 t2;

    public Test03 getT3() {
        return t3;
    }

    public Test02 getT2() {
        return t2;
    }

    public void setT3(Test03 t3) {
        this.t3 = t3;
    }

    public void setT2(Test02 t2) {
        this.t2 = t2;
    }

    public static void main(String[] args) {
        Test04 t4 = new Test04();
        t4.getT2();
    }
}
