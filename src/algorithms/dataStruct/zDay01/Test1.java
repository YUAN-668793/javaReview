package dataStruct.zDay01;

/** 基于数组实现栈
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/22/2018 3:09 PM
 */
public class Test1 {
    private int top;
    private int capacity;
    private int[] array;
    public Test1(){
        top = -1;
        capacity = 1;
        array = new int[capacity];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isStackFull(){
        return top == capacity-1;
    }
    public void push(int data){
        if(isStackFull()){
            System.out.println("栈满了");
        }else{
            array[++top] = data;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("栈为空");
            return 0;
        }else{
            return array[top--];
        }
    }
}
