package _02_leetcodes._array;
//https://leetcode.com/problems/sort-colors/solutions/
public class SortColor {
    public void sortColors(int[] nums) {
        // set three pivot, pivot1 starts from beginning and end as end of the array,
        // if the val == 0, set it to the end with less pivot , if it equals to 1, pass the pivot to next
        // if val == 2, set to more pivot and to the end of the array
        int less = 0;
        int more = nums.length - 1;
        int pivot = 0;
        while (pivot <= more) {
            if (nums[pivot] == 0) {
                int temp = nums[less];
                nums[less] = nums[pivot];
                nums[pivot] = temp;
                less++;
                pivot++;
            } else if (nums[pivot] == 1) {
                pivot++;
            } else if (nums[pivot] == 2) {
                int temp = nums[more];
                nums[more] = nums[pivot];
                nums[pivot] = temp;
                more--;
            }
        }
    }
}
