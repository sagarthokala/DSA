package com.sagar.arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeArray {

    public static void main(String[] args) {
        String[] array1 = {"Java", "is", "fun"};
        String[] array2 = {"and", "powerful"};

        String[] merged = Stream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .toArray(String[]::new);

        for(String s: merged){
            System.out.print(s + " ");
        }

    }
}
