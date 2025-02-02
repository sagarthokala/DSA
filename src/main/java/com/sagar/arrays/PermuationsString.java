package com.sagar.arrays;

public class PermuationsString {

    public static void main(String[] args) {

        String s = "abc";

        permuatations(s,"");

    }

    private static void permuatations(String s, String prefix) {

        if(s.isEmpty()){
            System.out.println(prefix);
        }else{
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                String remaining = s.substring(0,i)+s.substring(i+1);

                permuatations(remaining, prefix+ch);
            }
        }

    }
}
