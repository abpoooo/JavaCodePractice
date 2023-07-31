package _02_leetcodes;
//https://leetcode.com/problems/sliding-window-maximum/
public class SlidingWindowMaximum {
    // 1. If nums[i] >= nums[tail], removing tail until nums[tail] > nums[i]
    // 2. Add index i into tail of deque
    // 3. if w >= 0 remove expired head of dequeue update window max value at W position to nums[head]
//    public int[] maxSlidingWindow(int[] nums, int k)
}
