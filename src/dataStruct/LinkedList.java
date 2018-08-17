package dataStruct;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/16 20:22
 */
public class LinkedList<T> {

    /**
     * 定义结点node
     * @param <T>
     */
    private static class Node<T>{
        T data;
        Node<T> next;
        Node(T data,Node<T> next){
            this.data = data;
            this.next = next;
        }
        Node(T data){
            this(data,null);
        }
    }

    //数据信息
    private Node<T> head;
    private Node<T> tail;
    //初始化
    public LinkedList(){
        head = tail = null;
    }

    //判断list是否为空
    public boolean isEmpty(){
        return head == null;
    }

    //添加一个头节点
    public void addNode(T item){
        head = new Node<T>(item);
        if(tail == null){
            tail = head;
        }
    }

    //添加一个尾节点
    public void addTail(T item){
        if(!isEmpty()){
            tail.next = new Node<T>(item);
            tail = tail.next;
        }else{
            head = tail = new Node<T>(item);
        }
    }

    //打印list
    public void traverse(){
        if(isEmpty()){
            System.out.println("null");
        }else{
            for(Node<T> p = head;p!=null;p = p.next){
                System.out.println(p.data);
            }
        }
    }

    //从头部增加一个节点
    public void addFromHead(T item){
        Node<T> newNode = new Node<T>(item);
        newNode.next = head;
        head = newNode;
    }

    //从尾部增加一个节点
    public void addFormTail(T item){
        Node<T> newNode = new Node<T>(item);
        Node<T> p = head;
        while(p.next != null){
            p = p.next;
        }
        p.next = newNode;
        newNode.next = null;
    }

    //从头部删除一个节点
    public void removeFormHead(){
        if(!isEmpty()){
            head = head.next;
        }else{
            System.out.println("The list have been emptited");
        }
    }

    //从尾部删除一个节点，低效
    public void removeFromTail(){
        Node<T> prev = null;
        Node<T> curr = head;
        while(curr.next != null){
            prev = curr;
            curr = curr.next;
            if(curr.next == null){
                prev.next = null;
            }
        }
    }

    //插入一个新节点
    public boolean insert(T appointedItem,T item){
        Node<T> prev = head;
        Node<T> curr = head.next;
        Node<T> newNode;
        if(!isEmpty()){

        }
        return true;
    }
}
