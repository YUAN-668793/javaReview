package algorithms.dataStruct.linkList;

/** 单向链表操作
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/17 18:37
 */
public class ListNodeFun {

    //统计链表中节点个数
    public int listLength(ListNode headNode){
        int length = 0;
        ListNode currentNode = headNode;
        while(headNode.getNext() != null){
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }

    //向链表中插入一个节点
    ListNode insertInLinkedList(ListNode headNode,ListNode nodeToInsert,int position){
        if(headNode == null){   //若链表为空，则插入
            return nodeToInsert;
        }
        int size = listLength(headNode);
        if(position>size+1 || position<1){
            System.out.println("Position of node to insert is invaild, the valid inputs are 1 to"+(size+1));
            return headNode;
        }

        if(position == 1){      //在链表开头插入
            nodeToInsert.setNext(headNode);
            return nodeToInsert;
        }else{
            //在链表中间或是结尾插入
            ListNode previousNode = headNode;
            int count = 0;
            while(count<position-1){
                previousNode = previousNode.getNext();
                count++;
            }
            ListNode currentNode = previousNode.getNext();
            nodeToInsert.setNext(currentNode);
            previousNode.setNext(nodeToInsert);
           //headNode = previousNode;
        }
        return headNode;
    }

    //从链表中删除一个节点
    public ListNode deleteNodeFormLinkedList(ListNode headNode,int position){
        int size = listLength(headNode);
        if(position>size || position<1){
            System.out.println("Position of node to insert is invaild, the valid inputs are 1 to"+(size+1));
            return headNode;
        }
        if(position == 1){    //删除单链表的表头结点
            ListNode currentNode = headNode.getNext();
            headNode = null;
            return currentNode;
        }else{              //删除中间或表尾节点
            ListNode previousNode = headNode;
            int count = 1;
            while(count<position){
                previousNode = previousNode.getNext();
                count++;
            }
            ListNode currentNode = previousNode.getNext();
            headNode.setNext(currentNode.getNext());
            currentNode = null;
        }
        return headNode;
    }

    //删除单向链表
    public void deleteLinkedList(ListNode head){
        ListNode auxilaryNode;
        ListNode iterator = head;
        while(iterator != null){
            auxilaryNode = iterator.getNext();
            iterator = null;     //在Java中，垃圾回收期将自动处理
            iterator = auxilaryNode;  //在实际应用中，不需要实现该内容
        }
    }
}
