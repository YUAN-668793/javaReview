package dataStruct.linkList;

/** 双向链表
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/17 19:22
 */
public class DLLNode {
    private int data;
    private DLLNode next;
    private DLLNode previous;
    public DLLNode(int data){
        this.data = data;
    }
    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return data;
    }
    public void setNext(DLLNode next){
        this.next = next;
    }

    public DLLNode getNext() {
         return this.next;
    }
    public void setPrevious(DLLNode previous){
        this.previous = previous;
    }

    public DLLNode getPrevious() {
        return previous;
    }
    
}
