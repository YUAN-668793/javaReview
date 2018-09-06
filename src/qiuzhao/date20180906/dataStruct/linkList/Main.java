package qiuzhao.date20180906.dataStruct.linkList;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/6/2018 9:52 AM
 */
public class Main {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(2);
        listNode.setNext(listNode);
        ListNode listNode1 = new ListNode(3);
        listNode.setNext(listNode1);
        int result = listNode.getData();
        listNode.setNext(listNode1);
        System.out.println(listNode.getNext().getData());
    }
}
