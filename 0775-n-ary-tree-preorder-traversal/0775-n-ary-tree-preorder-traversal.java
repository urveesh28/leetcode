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
};
*/

class Solution {
    
    private static void preOrder(Node root,List<Integer> ans){
        if(root!=null){
            ans.add(root.val);
            for(int i=0;i<root.children.size();i++){
                preOrder(root.children.get(i),ans);
            }
        }
    }

    public List<Integer> preorder(Node root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<Integer> ans=new ArrayList<>();
        preOrder(root,ans);
        return ans;
    }
}