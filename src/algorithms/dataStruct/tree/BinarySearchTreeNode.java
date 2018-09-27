package algorithms.dataStruct.tree;

/** 二叉搜索树寻找元素
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/27/2018 2:48 PM
 */
public class BinarySearchTreeNode {

    //搜索指定元素
    public BinaryTreeNode find(BinaryTreeNode root, int data){
        if(root == null){
            return null;
        }if(data<root.getData()){
            return find(root.getLeft(),data);
        }if(data>root.getData()){
            return find(root.getRight(),data);
        }
        return root;
    }

    //搜索最小元素
    public BinaryTreeNode findMin(BinaryTreeNode root){
        if(root == null){
            return null;
        }else{
            if(root.getLeft() == null){
                return root;
            }else{
                return findMin(root.getLeft());
            }
        }
    }

    //搜索最大元素
    public BinaryTreeNode findMax(BinaryTreeNode root){
        if(root == null){
            return null;
        }else{
            if(root.getRight() == null){
                return root;
            }else{
                return findMax(root.getRight());
            }
        }
    }
}
