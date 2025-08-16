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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>l=new ArrayList<>();
        if(root==null)
        return l;
        Queue<TreeNode>q=new LinkedList<>();
       
        q.add(root);
        while(!q.isEmpty())
        {
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                  TreeNode traverse=q.poll();
                  if(i==n-1)
                  l.add(traverse.val);
                  if(traverse.left!=null)
                  q.add(traverse.left);
                  if(traverse.right!=null)
                  q.add(traverse.right);
                  
           }

        }
        return l;
    }
}