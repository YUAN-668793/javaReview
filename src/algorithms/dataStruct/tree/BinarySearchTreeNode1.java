package algorithms.dataStruct.tree;

/** 二叉搜索树非递归版本
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/27/2018 2:54 PM
 */
public class BinarySearchTreeNode1 {
    public BinaryTreeNode find(BinaryTreeNode root, int data){
        if(root == null) return null;
        while(root != null){
            if(data == root.getData()){
                return root;
            }else if(data>root.getData()){
                root = root.getRight();
            }else{
                root =root.getLeft();
            }
        }
        return null;
    }
}
