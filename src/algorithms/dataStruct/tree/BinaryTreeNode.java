package algorithms.dataStruct.tree;

/** 二叉树
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/18 12:54
 */
public class BinaryTreeNode {
    private int data;
    private BinaryTreeNode left;
    private BinaryTreeNode right;
    public int getData(){
        return data;
    }
    public void setData(int data){
        this.data = data;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }
    public void setLeft(BinaryTreeNode left){
        this.left = left;
    }
    public void setRight(BinaryTreeNode right){
        this.right = right;
    }
}
