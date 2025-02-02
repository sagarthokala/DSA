package com.sagar.arrays;

public class SecondMax {

    public static void main(String[] args) {
        int[] arr = {23,41,53,55,76,2,45};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i] >secondMax && arr[i] < max){
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
