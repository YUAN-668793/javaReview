package mianshi.jianzhiOffer;

import mianshi.jianzhiOffer.temp.ListNode;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 10/7/2018 4:12 PM
 */

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class Test14 {
    public ListNode FindKthToTail(ListNode head, int k) {
        /*if (head == null)   return head;
        List<ListNode> temp = new ArrayList<>();
        int count = 0;
        while(head.next != null){
            temp.add(head);
            head = head.next;
            count++;
        }
        if(count<k){
            return null;
        }
        int index = temp.size() - k;
        return temp.get(index);*/

        if(head == null) return head;
        ListNode node = head;
        int count = 0;
        while(node != null){
            count++;
            node = node.next;
        }
        if(count<k) return null;
        ListNode p = head;
        for(int i = 0;i<count-k;i++){
            p = p.next;
        }
        return p;
    }
}
