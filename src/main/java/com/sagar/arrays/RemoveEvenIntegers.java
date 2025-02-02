package com.sagar.arrays;

public class RemoveEvenIntegers {

    public static void main(String[] args) {

        int[] arr = {2,1,3,1,4,6,7,3,8,6};
        removeEven(arr);
    }

    private static void removeEven(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] %2 !=0){
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] %2 !=0){
                result[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
