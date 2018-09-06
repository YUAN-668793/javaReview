package mianshi.qiuzhao.meituan;

import java.util.Scanner;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/6/2018 6:36 PM
 */
public class Main {
    class Node{
        int data;
        Node previous;
        Node next;

        public void getNode(){
        }
    }
    public void calc(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //用于存放获取的所有点
        int[] arr = new int[N];
        //编号从1到N
        for(int i=1;i<=N;i++){
            arr[i] = i;
        }
        //结果存放的数组结点
        Node[] resultNode = new Node[N];
        for(int i=0;i<N-1;i++){
            Node node = new Node();
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            node.data = x1;
           // node.next = ;
        }
        System.out.println();
    }
    public static void main(String[] args) {

    }
}
