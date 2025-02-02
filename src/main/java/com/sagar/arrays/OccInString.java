package com.sagar.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccInString {

    public static void main(String[] args) {
        String input = "This is a test. This test is a sample test.";

        Map<String, Long> wordCount = Arrays.stream(input.split("\\W+"))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(wordCount);

        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] strArray = input.split("\\s");
        for(String s: strArray){
            wordCountMap.put(s, wordCountMap.getOrDefault(s,0)+1);
        }

        for(Map.Entry<String, Integer>  entry: wordCountMap.entrySet()){
            System.out.println(entry.getKey() +": ->"+entry.getValue());
        }
    }
}
