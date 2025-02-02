package com.sagar.arrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqInaWord {

    public static void main(String[] args) {
        String s = "sagar";

        //print the frequency of each character in given order
        Map<Character, Long> count = s.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(count);

        //find the count of vowels and constants
        List<Character> vow = Arrays.asList('a', 'e', 'i', 'o', 'u');

        Map<Boolean, Long> vowelsConst = s.chars().mapToObj(c->(char)c)
                .filter(Character::isLetter)
                .collect(Collectors.groupingBy(
                        e -> vow.contains(Character.toLowerCase(e)), Collectors.counting()
                ));

        long vowels = vowelsConst.get(true);
        long constants = vowelsConst.get(false);

        System.out.println(vowels);
        System.out.println(constants);
    }
}
