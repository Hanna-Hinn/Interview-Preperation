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
//Given the root of a binary tree, return its maximum depth.

//A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
class maxDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
         if(root == null){
            return 0;
        }
        if(-100 <= root.val && root.val <= 100){
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        
        if(leftDepth > rightDepth)
            return leftDepth+1;
        else
            return rightDepth+1;
            
        }
        return 0;
    }
}
