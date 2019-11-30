package com.sham.Challenge2;

public class ReverseString {

    public static void reverse(){
        String name = "cool";
        char[] temp = name.toCharArray();

        for (int i = temp.length-1; i >=0; i--){
            System.out.println(temp[i]);
        }
    }
}
