package com.sagar.arrays;

public class MinimumValue {
    public static void main(String[] args) {
        int[] arr = {23,41,53,55,76,2,45};

        int min = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] <min){
                min = arr[i];
            }
        }
        System.out.println("min: "+ min);
    }
}
