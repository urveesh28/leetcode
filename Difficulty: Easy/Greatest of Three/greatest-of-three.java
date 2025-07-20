//Back-end complete function Template for Java
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        int max=-1;
        a=sc.nextInt();
        max=max<a?a:max;
        b=sc.nextInt();
        max=max<b?b:max;
        c=sc.nextInt();
        max=max<c?c:max;
        System.out.println(max);
    }
}