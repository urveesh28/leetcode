//{ Driver Code Starts
//Initial Template for Java


import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class GfG {

	static Node buildTree(String str) {

		if (str.length() == 0 || str.charAt(0) == 'N') {
			return null;
		}

		String ip[] = str.split(" ");
		// Create the root of the tree
		Node root = new Node(Integer.parseInt(ip[0]));
		// Push the root to the queue

		Queue<Node> queue = new LinkedList<>();

		queue.add(root);
		// Starting from the second element

		int i = 1;
		while (queue.size() > 0 && i < ip.length) {

			// Get and remove the front of the queue
			Node currNode = queue.peek();
			queue.remove();

			// Get the current node's value from the string
			String currVal = ip[i];

			// If the left child is not null
			if (!currVal.equals("N")) {

				// Create the left child for the current node
				currNode.left = new Node(Integer.parseInt(currVal));
				// Push it to the queue
				queue.add(currNode.left);
			}

			// For the right child
			i++;
			if (i >= ip.length)
				break;

			currVal = ip[i];

			// If the right child is not null
			if (!currVal.equals("N")) {

				// Create the right child for the current node
				currNode.right = new Node(Integer.parseInt(currVal));

				// Push it to the queue
				queue.add(currNode.right);
			}
			i++;
		}

		return root;
	}

	static void printInorder(Node root) {
		if (root == null)
			return;

		printInorder(root.left);
		System.out.print(root.data + " ");

		printInorder(root.right);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t > 0) {
			String s = br.readLine();
			int target = Integer.parseInt(br.readLine());
			Node root = buildTree(s);

			Solution g = new Solution();
			System.out.println(g.minTime(root, target));
			t--;

		}
	}
}



// } Driver Code Ends


//User function Template for Java

class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    
    private static void create(Node root,Map<Integer,Set<Integer>> adj){
        if(root==null)return;
            
            if(root.left!=null){
                
                adj.computeIfAbsent(root.data,k-> new HashSet<Integer>()).add(root.left.data);
                adj.computeIfAbsent(root.left.data,k-> new HashSet<Integer>()).add(root.data);
                create(root.left,adj);
            }
            
            if(root.right!=null){
        
                adj.computeIfAbsent(root.data,k-> new HashSet<Integer>()).add(root.right.data);
                adj.computeIfAbsent(root.right.data,k-> new HashSet<Integer>()).add(root.data);
                create(root.right,adj);
            }
        
        
    }
    
    private static int bfs(Map<Integer,Set<Integer>> adj,Set<Integer> visited,int src){
        visited.add(src);
        Queue<Integer> q=new LinkedList<>();
        q.offer(src);
        int ans=0;
        while(!q.isEmpty()){
            int size=q.size();
            ans++;
            for(int i=0;i<size;i++){
                int curr=q.poll();
                for(int j : adj.get(curr)){
                if(!visited.contains(j)){
                    visited.add(j);
                    q.offer(j);
                }
            }
            }
        }
        
        return ans-1;
        
    }


//{1=[2, 3], 2=[1, 4, 5], 3=[1, 6], 4=[2], 5=[2, 7, 8], 6=[3, 9], 7=[5], 8=[5], 9=[6, 10], 10=[9]}    
    public static int minTime(Node root, int target) 
    {
        // Your code goes here
        if(root.left==null && root.right==null)return 0; 
        Map<Integer,Set<Integer>> adj=new HashMap<>();
        
        create(root,adj);
        //System.out.println(adj);
        Set<Integer> visited=new HashSet<>();
        return bfs(adj,visited,target);
        
        
    }
}