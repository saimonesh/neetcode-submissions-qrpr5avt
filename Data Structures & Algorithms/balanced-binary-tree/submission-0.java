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
    public boolean isBalanced(TreeNode root) {
        return dfs(root,0)!=-1;
    }
     int dfs(TreeNode root,int cur){
        if(root==null)return cur;
        else{
            int lHeight = dfs(root.left,cur);
            int rHeight = dfs(root.right,cur);
            if(lHeight==-1 || rHeight == -1) return -1;
            int diff = Math.abs(lHeight-rHeight);
            if(diff>1) return -1;
            return Math.max(lHeight,rHeight) + 1;
        }
    }
}
