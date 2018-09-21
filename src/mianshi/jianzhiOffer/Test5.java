package mianshi.jianzhiOffer;

import java.util.Stack;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/21/2018 2:39 PM
 */

/**
 * 题目描述
 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */

/**
 * 思路：将元素进栈stack1，再出栈,入栈到stack2,再出栈，
 */
public class Test5 {
    /*Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int first = stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return first;
    }*/

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack1.empty()&&stack2.empty()){
            throw new RuntimeException("Queue is empty!");
        }
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        t.push(5);
        t.push(6);
        t.push(7);
        int result = t.pop();
        int result2 = t.pop();
        int result3 = t.pop();
        int result4 = t.pop();
        System.out.println(result);
        System.out.println(result2);
    }
}
