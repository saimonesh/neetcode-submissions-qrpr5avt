/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int maxDepth(TreeNode root) {
             return maxD(root,0);   
    }

    public int maxD(TreeNode root,int curDep)
    {
        if(root==null)return curDep;
        else{
            int leftMax = maxD(root.left,curDep+1);
            int rightMax = maxD(root.right,curDep+1);
            return Integer.max(leftMax,rightMax);
        }
    }

}
