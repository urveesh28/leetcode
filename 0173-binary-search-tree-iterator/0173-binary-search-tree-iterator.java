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
class BSTIterator {

    Queue<Integer> q;
    
    private static void preOrder(TreeNode root,Queue<Integer> q){
        if(root==null)return;
        q.offer(root.val);
        preOrder(root.left,q);
        preOrder(root.right,q);
    }
    
    public BSTIterator(TreeNode root) {
        q=new PriorityQueue<>((a,b)->(a-b));
        preOrder(root,q);
    }
    
    public int next() {
        return q.poll();
    }
    
    public boolean hasNext() {
        return !q.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */