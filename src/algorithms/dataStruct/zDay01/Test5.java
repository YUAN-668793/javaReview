package dataStruct.zDay01;

/** 单向链表操作
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/22/2018 5:31 PM
 */
public class Test5 {
    //统计链表中结点个数
    public int listLength(Test3 headNode){
        int length = 0;
        Test3 currentNode = headNode;
        while(currentNode.getNext() != null){
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }

    //向链表中插入一个节点
    Test3 insertInLinkedList(Test3 headNode,Test3 nodeToInsert,int position){
        //如果链表为空
        if(headNode == null){
            return nodeToInsert;
        }
        int size = listLength(headNode);
        if(position>size+1 || position<1){
            System.out.println("Position invaild");
            return headNode;
        }
        if(position == 1){
            nodeToInsert.setNext(headNode);
            return nodeToInsert;
        }else{
            Test3 previousNode = headNode;
            int count = 0;
            while(count<position-1){
                previousNode = previousNode.getNext();
                count++;
            }
            Test3 currentNode = previousNode.getNext();
            nodeToInsert.setNext(currentNode);
            previousNode.setNext(nodeToInsert);
        }
        return headNode;
    }

    public Test3 deleteNodeFormLinkedList(Test3 headNode,int position){
        int size = listLength(headNode);
        if(position>size || position<1){
            System.out.println("position invaild");
            return headNode;
        }
        if(position == 1){
            Test3 currentNode = headNode.getNext();
            headNode = null;
            return currentNode;
        }else{
            Test3 previousNode = headNode;
            int count = 0;
            while(count<position){
                previousNode = previousNode.getNext();
                count++;
            }
            Test3 currentNode = previousNode.getNext();
            headNode.setNext(currentNode.getNext());
            currentNode = null;
        }
        return headNode;
    }

    public void deleteLinkedList(Test3 head){
        Test3 auxilaryNode;
        Test3 iterator = head;
        while(iterator != null){
            auxilaryNode = iterator.getNext();
            iterator = null;
            iterator = auxilaryNode;
        }
    }
}
