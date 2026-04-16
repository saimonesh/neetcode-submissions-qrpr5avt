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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> r1 = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode x = queue.poll();
                if(x!=null){
                r1.add(x.val);
                queue.add(x.left);
                queue.add(x.right);
                }  
            }
            if(!r1.isEmpty())result.add(r1);
        }
        return result;
    }
}
