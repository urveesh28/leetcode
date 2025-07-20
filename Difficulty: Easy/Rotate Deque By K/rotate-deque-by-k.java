// User function Template for Java
class Solution {
    // Function to rotate deque by k places in anti-clockwise direction.
    public static void left_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int k) {
        // Your code here
        k=k%deque.size();
        for(int i=0;i<k;i++){
            deque.addLast(deque.removeFirst());
        }
    }

    // Function to rotate deque by k places in clockwise direction.
    public static void right_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int k) {

        
        // Your code here
        k=k%deque.size();
        for(int i=0;i<k;i++){
            deque.addFirst(deque.removeLast());
        }
    }
}