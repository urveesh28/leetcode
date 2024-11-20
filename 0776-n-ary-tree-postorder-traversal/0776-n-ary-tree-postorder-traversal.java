/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    
    private static void postOrder(Node root,List<Integer> ans){
        if(root==null){
            return;
        }
        for(int i=0;i<root.children.size();i++){
            postOrder(root.children.get(i),ans);
        }
        ans.add(root.val);
    }
    
    public List<Integer> postorder(Node root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<Integer> ans=new ArrayList<>();
        postOrder(root,ans);
        return ans;
    }
}