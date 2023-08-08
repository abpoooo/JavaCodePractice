package _02_leetcodes;
//https://leetcode.com/problems/happy-number/
public class HappyNumber {
    public boolean isHappy(int n) {
        // think of the forever loop as a linkedlist of cycle, so when fast and slow pivot equal to
        //each other, the loop will be forever, and it is not a happy number
        int slow = n;
        int fast = n;

        do{
            slow = square(slow);
            fast = square(square(fast));
        }while (slow != fast);

        return slow == 1;
    }
    public int square(int num){
        int ans = 0;

        while (num > 0){
            int remainder = num % 10;
            ans+= remainder *remainder;
            num /= 10;
        }
        return ans;
    }
}
