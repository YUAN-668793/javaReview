package jvm;

/**栈溢出
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/24/2018 10:36 PM
 */
public class JavaVMStackSOF {
    private int stackLength = 1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try{
            oom.stackLeak();
        }catch(Throwable e){
            System.out.println("stack length:"+oom.stackLength);
            e.printStackTrace();
        }
    }
}
