package mianshi.jianzhiOffer;

import mianshi.jianzhiOffer.temp.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 10/9/2018 9:28 AM
 */

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 *
 * 这不就是二叉树的层次遍历么，借助一个队列就可以了。
 */
public class Test21 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list= new ArrayList<>();
        if(root == null) return list;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        while(!deque.isEmpty()){
            TreeNode t = deque.pop();
            list.add(t.val);
            if(t.left!=null) deque.add(t.left);
            if(t.right!=null) deque.add(t.right);
        }
        return list;
    }
}
