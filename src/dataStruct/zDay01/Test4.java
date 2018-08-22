package dataStruct.zDay01;

/** 双向链表
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/22/2018 5:29 PM
 */
public class Test4 {
    private int data;
    private Test4 previous;
    private Test4 next;

    public Test4(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Test4 getPrevious() {
        return previous;
    }

    public void setPrevious(Test4 previous) {
        this.previous = previous;
    }

    public Test4 getNext() {
        return next;
    }

    public void setNext(Test4 next) {
        this.next = next;
    }
}
