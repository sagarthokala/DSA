package com.sagar.LeetCode;

public class RemoveDuplicates2 {

    public static void main(String[] args) {

        //remove duplicate elements from the sorted array -- L26

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]){
                count++;
            }
        }

        int[] result = new int[count];

        result[0] = nums[0];

        int index =1;
        for (int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                result[index++] = nums[i];
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
