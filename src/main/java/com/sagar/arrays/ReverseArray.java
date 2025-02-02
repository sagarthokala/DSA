package com.sagar.arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        //solution 1
        reverseArr1(arr);

        //solution2
        reverseArr2(arr);
    }

    private static void reverseArr2(int[] arr) {

        int start = 0, end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(" Solution 2");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    private static void reverseArr1(int[] arr) {

        int[] result = new int[arr.length];
        int index = arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            result[index] = arr[i];
            index--;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
