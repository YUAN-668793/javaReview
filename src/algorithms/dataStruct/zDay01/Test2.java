package dataStruct.zDay01;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/22/2018 4:33 PM
 */
public class Test2 {
    private int rear;
    private int front;
    private int capacity;
    private int[] array;
    private Test2(int size){
        capacity = size;
        rear = -1;
        front = -1;
        array = new int[size];
    }
    public static Test2 createQueue(int size){
        return new Test2(size);
    }
    public boolean isEmpty(){
        return front == -1;
    }
    public boolean isFull(){
        return (rear+1)%capacity == front;
    }
    public int getQueueSize(){
        return (capacity-front+rear+1)%capacity;
    }
    public void enQueue(int data){
        if(isFull()){
            System.out.println("队列满了");
        }else{
            rear = (rear+1)%capacity;
            array[rear] = data;
            if(rear == front){
                rear = front;
            }
        }
    }
    public int deQueue(){
        int data = 0;
        if(isEmpty()){
            System.out.println("Queue empty");
            return 0;
        }
        data = array[front];
        if(front == rear){
            front = rear-1;
        }else{
            front = (front+1)%capacity;
        }
        return data;
    }

}
