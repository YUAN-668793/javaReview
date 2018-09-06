package dataStruct.zDay01;

/** 单向链表
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/22/2018 5:10 PM
 */
public class Test3 {
    private int data;
    private Test3 next;
    public Test3(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Test3 getNext() {
        return next;
    }

    public void setNext(Test3 next) {
        this.next = next;
    }
}
