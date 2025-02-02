package com.sagar.arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordCount {
    public static void main(String[] args) {

        String input = "This is a test. This test is a sample test. Test this sample.";

        Map<String, Long> wordCount = Arrays.stream(input.toLowerCase().split("\\W+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        wordCount.entrySet().stream()
                .filter(w -> w.getValue()>1)
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
    }
}
