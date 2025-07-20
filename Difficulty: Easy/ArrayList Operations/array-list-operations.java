// User function Template for Java
class Solution {

    public static void add_to_ArrayList(ArrayList<Integer> A, int x) {
        // Your code here
        
        A.add(x);
        // Just add, don't print anything
    }

    public static void sort_ArrayList_Asc(ArrayList<Integer> A) {

        Collections.sort(A);
        // Your code here
        // Just sort, don't print anything
    }

        
    public static void reverse_ArrayList(ArrayList<Integer> A) {
        // Your code here
        // Just reverse, don't print anything
        for(int i=0;i<A.size()/2;i++){
            int temp1=A.get(i);
            int temp2=A.get(A.size()-i-1);
            A.set(i,temp2);
            A.set(A.size()-i-1,temp1);
        }
        
    }
        

    public static int size_Of_ArrayList(ArrayList<Integer> A) {
        // Your code here
        // Return the size of ArrayList
        return A.size();
        
    }

    public static void sort_ArrayList_Desc(ArrayList<Integer> A) {
        // Your code here

        
        // Just sort in desc order, don't print anything
        Collections.sort(A,Collections.reverseOrder());
    }

    public static void print_ArrayList(ArrayList<Integer> A) {
        // Your code here
        // Print the elements of A, don't add new line
        for(int i : A){
            System.out.print(i+" ");
        }
    }
}
