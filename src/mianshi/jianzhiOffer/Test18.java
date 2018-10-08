package mianshi.jianzhiOffer;

import mianshi.jianzhiOffer.temp.TreeNode;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 10/8/2018 7:59 PM
 */

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4
 * 矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出
 * 数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class Test18 {
    public void mirror(TreeNode root){
        TreeNode temp;
        if(root!=null){
            temp = root.left;
            root.left = root.right;
            root.right = temp;
            if(root.left != null){
                mirror(root.left);
            }if(root.right!=null){
                mirror(root.right);
            }
        }
    }
}
