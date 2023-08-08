package _02_leetcodes._array;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/spiral-matrix/
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        // set top left right bottom 4 int
        //set new List as the results;
        //while top <= bottom and left <= right loop the 4 for loops to add ints to array list
        // 4 for loop to iterate the value in to array list with add()
        int top = 0;
        int left = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;
        List<Integer> res = new ArrayList<>();
        while (top <= bottom && left <= right){
            for (int i = left; i <right ; i++) {
                res.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i < bottom ; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            // set another if to make sure top < bottom or left < right, otherwise break;
            if (top > bottom || left > right) break;
            for (int i = right; i > left ; i--) {
                res.add(matrix[bottom][i]);
            }
            bottom--;

            for (int i = bottom; i > top ; i--) {
                res.add(matrix[i][left]);
            }
            left++;
        }



        return res;
    }
}
