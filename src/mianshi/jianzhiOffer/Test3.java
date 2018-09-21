package mianshi.jianzhiOffer;

import mianshi.jianzhiOffer.temp.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/21/2018 10:35 AM
 */

/**
 * 题目描述
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
/**
 * 思路：
 * 判断listNode链表结点是否为空，不为空的话，则将数据取出，存入到栈中，当前结点的值替换成下一个结点值
 * 当栈不为空时，逐个出栈
 */

/**
 * public class ListNode {
 int val;
 ListNode next = null;
 ListNode(int val) {
 this.val = val;
 }
 }
 */
public class Test3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack stack = new Stack();
        ArrayList<Integer> result = new ArrayList<>();
        while(listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while(!stack.isEmpty()){
            result.add((Integer)stack.pop());
        }
        return  result;
    }
}
