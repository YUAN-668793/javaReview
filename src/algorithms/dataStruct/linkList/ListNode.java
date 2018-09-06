package dataStruct.linkList;

/** 单向链表
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/17 18:29
 */
public class ListNode {
    private int data;
    private ListNode next;
    public ListNode(int data){
        this.data = data;
    }
    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return data;
    }
    public void setNext(ListNode next){
        this.next = next;
    }
    public ListNode getNext(){
        return next;
    }
}
