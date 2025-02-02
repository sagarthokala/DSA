package com.sagar.LeetCode;

public class RotateArray {
    public static void main(String[] args) {

        //program to rotate the given array by K times
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        int n = nums.length;
        k = k % n;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = rotated[i];
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+ " ");
        }



       /* int[] result = new int[nums.length];
        int len = nums.length-k;
        for(int i=0; i<k; i++){
            result[i] = nums[len];
            len++;
        }

    int index = k;
        for (int i = 0; i < nums.length-k; i++) {
            result[index] = nums[i];
            index++;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+ " ");
        }
*/

    }
}
