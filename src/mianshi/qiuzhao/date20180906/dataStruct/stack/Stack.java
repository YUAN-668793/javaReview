package mianshi.qiuzhao.date20180906.dataStruct.stack;

/** 基于数组实现栈
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/6/2018 9:36 AM
 */
public class Stack {
    private int top;
    private int capacity;
    private int[] array;

    public Stack(){
        capacity = 1;
        array = new int[capacity];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity-1;
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Stack Overflow");
        }else{
            array[++top] = data;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }else{
            return array[top--];
        }
    }

    public void delete(){
        top = -1;
    }
}
