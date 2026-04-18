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
    int result = -1;
    int cur = 0;
    public int kthSmallest(TreeNode root, int k) {
        findKthSmallest(root,k);
        return result;
    }
    public void findKthSmallest(TreeNode root,int k){
        if(root==null)
        return;
        else{
            findKthSmallest(root.left,k);
            cur++;
            if(cur==k){
                result = root.val;
                return;
            }
            findKthSmallest(root.right,k);
        }
    }

    
}
