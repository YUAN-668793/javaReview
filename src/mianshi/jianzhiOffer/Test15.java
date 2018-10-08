package mianshi.jianzhiOffer;

import mianshi.jianzhiOffer.temp.ListNode;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 10/7/2018 6:10 PM
 */

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
//pNode当前节点，pPrev上一个节点，pNext下一个节点
public class Test15 {
    public ListNode ReverseList(ListNode head) {
      /* if(head==null)
            return null;
        ListNode newHead = null;
        ListNode pNode = head;
        ListNode pPrev = null;
        while(pNode!=null){
            ListNode pNext = pNode.next;
            if(pNext==null)
                newHead = pNode;
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }*/
       if(head == null) return head;
       ListNode newHead = null;
       ListNode pNode = head;
       ListNode pPrev = null;
       while(pNode != null){
           ListNode pNext = pNode.next;
           if(pNext == null)  newHead = pNode;
           pNode.next = pPrev;
           pPrev = pNode;
           pNode = pNext;
       }
       return newHead;
    }
}
