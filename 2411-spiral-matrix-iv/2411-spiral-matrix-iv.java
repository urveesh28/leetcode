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
    
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        
        int[][] mat=new int[m][];
        
        for(int i=0;i<m;i++){
            mat[i]=new int[n];
            Arrays.fill(mat[i],-1);
        }

        int rs=0;
        int cs=0;
        int re=m-1;
        int ce=n-1;

        
        while(rs<=re && cs<=ce){
            
        //right
        for(int i=cs;i<=ce && head!=null;i++){
            mat[rs][i]=head.val;
            head=head.next;
        }

        rs++;
        
        //down
        for(int i=rs;i<=re && head!=null;i++){
            mat[i][ce]=head.val;
            head=head.next;
        }

        ce--;

        //left
        if(rs<=re){
            for(int i=ce;i>=cs && head!=null;i--){
                mat[re][i]=head.val;
                head=head.next;
            }
            re--;
        }

        //up
        if(cs<=ce){
            for(int i=re;i>=rs && head!=null;i--){
                mat[i][cs]=head.val;
                head=head.next;
            }
            cs++;
        }

    }
    return mat;
}
}