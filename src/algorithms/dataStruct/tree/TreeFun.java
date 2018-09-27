package algorithms.dataStruct.tree;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/18 13:24
 */
public class TreeFun {

    public void preOrder(BinaryTreeNode root){
        if(root != null){
            System.out.println(root.getData());
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

}
