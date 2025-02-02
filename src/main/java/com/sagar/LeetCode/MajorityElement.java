package com.sagar.LeetCode;


import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {

        int[] nums = {2,2,1,1,1,2,2};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        int majorityElement = nums[0];
        int maxCount = 0;
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            if(entry.getValue() > maxCount){
                majorityElement =  entry.getKey();
                maxCount = entry.getValue();
            }
        }

        if(maxCount>nums.length/2){
            System.out.println("majority element:" + majorityElement);
        }
        else {
            System.out.println("there is no majority element");
        }
    }
}
