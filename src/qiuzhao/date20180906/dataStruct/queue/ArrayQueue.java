package qiuzhao.date20180906.dataStruct.queue;

/** 循环队列
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/6/2018 10:42 AM
 */
public class ArrayQueue {
    private int rear ;
    private int front;
    private int capacity;
    private int[] array;

    public ArrayQueue(int size){
        capacity = size;
        front = -1;
        rear = -1;
        array = new int[capacity];
    }

    public boolean isEmpty(){
        return front == -1;
    }
    public boolean isFull(){
        return (rear+1)%capacity == front;
    }
    public void enQueue(int data){
        if(isFull()){
            System.out.println("queue is full");
        }else{
            rear = (rear+1)%capacity;
            array[rear] = data;
            if(front == -1){
                front = rear;
            }
        }
    }
    public int deQueue(){
        int data = 0;
        if(isEmpty()){
            System.out.println("Queue Empty");
        }else{
            data = array[front];
            if(front == rear) {
                front = rear - 1;
            }else{
                front = (front+1)%capacity;
            }
        }
        return data;
    }
}
