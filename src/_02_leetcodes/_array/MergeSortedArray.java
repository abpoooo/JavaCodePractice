package _02_leetcodes._array;
//https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // set up int i1 and i2 as index representing the m, n of the elements
        // set up cur as the index as end of the nums1 to be final nums[] for the array
        // compare the two array values by index i1 and i2, then choose the lager one to be end of nums1
        //end
        int i1 = m-1;
        int i2 = n-1;
        int cur = nums1.length - 1;
        while (i2 >= 0){
            if (i1 >= 0 && nums1[i1] > nums2[i2]) nums1[cur--] = nums1[i1--];
            else nums1[cur--] = nums2[i2--];
        }
    }
}
