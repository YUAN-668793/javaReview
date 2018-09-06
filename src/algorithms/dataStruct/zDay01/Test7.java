package dataStruct.zDay01;

/** 二叉树前序遍历
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/22/2018 7:06 PM
 */
public class Test7 {
    public void preOrder(Test6 root){
        if(root != null){
            System.out.println(root.getData());
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }
}
