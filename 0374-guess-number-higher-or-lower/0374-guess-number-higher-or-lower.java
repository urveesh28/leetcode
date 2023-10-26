/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        /*while(true){
            if(guess(n)==-1){
                n-=1;
            }
            else if(guess(n)==1){
                n+=1;
            }
            else break;
        }*/

        int low=1;
        int high=n;
        int mid=low+(high-low)/2;
        while(low<=high){
            if(guess(mid)==-1){
                high=mid-1;
            }
            else if(guess(mid)==1){
                low=mid+1;
            }
            else break;
            mid=low+(high-low)/2;
        }
        return mid;
    }
}