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
class Solution 
{
    public boolean isCousins(TreeNode root, int x, int y) 
    {
        TreeNode xx=getNode(root,x);
        TreeNode yy=getNode(root,y);

        return (level(xx,root,0)==level(yy,root,0))&&(!siblings(xx,yy,root));
    }
    TreeNode getNode(TreeNode root,int x)
    {
        if(root==null)
        return null;

        if(root.val==x)
        return root;

        TreeNode left=getNode(root.left,x);
        if(left!=null)
        return left;

        return getNode(root.right,x);
    }
    int level(TreeNode trav,TreeNode root,int level)
    {
        if(root==null)
        return 0;

        if(root==trav)
        {
            return level;
        }

        int l=level(trav,root.right,level+1);
        if(l!=0)
        return l;

        return level(trav,root.left,level+1);
    }
    boolean siblings(TreeNode xx,TreeNode yy,TreeNode root)
    {
        if(root==null)
        return false;

        return (root.left==xx&&root.right==yy)||(root.left==yy&&root.right==xx)||siblings(xx,yy,root.left)||siblings(xx,yy,root.right);
    }
}