package qiuzhao.date20180906.dataStruct.linkList;

/** 单向链表
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/6/2018 9:49 AM
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

    public void setNext(ListNode data){
        this.next = next;
    }
    public ListNode getNext(){
        return next;
    }
}
