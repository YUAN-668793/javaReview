package dataStruct.tree;


/** 二叉搜索树寻找元素
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/27/2018 2:48 PM
 */
public class BinarySearchTreeNode {
    public BinaryTreeNode find(BinaryTreeNode root,int data){
        if(root == null){
            return null;
        }if(data<root.getData()){
            return find(root.getLeft(),data);
        }if(data>root.getData()){
            return find(root.getRight(),data);
        }
        return root;
    }
}
