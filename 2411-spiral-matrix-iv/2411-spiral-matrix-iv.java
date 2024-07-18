/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    private static List<Integer> helper(ListNode head){
        List<Integer> ans=new ArrayList<>();
        while(head!=null){
            ans.add(head.val);
            head=head.next;
        }
        return ans;
    }
    
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        
        List<Integer> ans=helper(head);
        System.out.println(ans);
        int[][] mat=new int[m][n];

        int rs=0;
        int cs=0;
        int re=m-1;
        int ce=n-1;

        ListNode temp=head;
        int k=0;
        while(rs<=re && cs<=ce){
            
        //right
        for(int i=cs;i<=ce;i++){
            mat[rs][i]=(k<ans.size()?ans.get(k):-1);
            k++;
        }

        rs++;
        
        //down
        for(int i=rs;i<=re;i++){
            mat[i][ce]=(k<ans.size()?ans.get(k):-1);
            k++;
        }

        ce--;

        //left
        if(rs<=re){
            for(int i=ce;i>=cs;i--){
                mat[re][i]=(k<ans.size()?ans.get(k):-1);
                k++;
            }
            re--;
        }

        //up
        if(cs<=ce){
            for(int i=re;i>=rs;i--){
                mat[i][cs]=(k<ans.size()?ans.get(k):-1);
                k++;
            }
            cs++;
        }

    }
    return mat;
}
}