package qiuzhao.date20180906.dataStruct.linkList;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/6/2018 10:04 AM
 */
public class Fun {
    public int length(ListNode listNode){
        int length = 0;
        ListNode currentNode = listNode;
        while(currentNode.getNext() != null){
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }

    public ListNode insertIntoListNode(ListNode headNode,ListNode insertNode,int position){
        if(length(headNode) == 0){
            headNode = insertNode;
            return headNode;
        }
        if(position<1 || position>length(headNode)+1){
            System.out.println("position invaild");
            return insertNode;
        }else{
            ListNode previous = headNode;
            int count = 0;
            while(count<position-1){
                previous = previous.getNext();
                count++;
            }
            ListNode currentNode = previous.getNext();
            insertNode.setNext(currentNode);
            previous.setNext(insertNode);
        }
        return headNode;
    }


}
