package com.sham.Challenge3;

public class LeapYear {
    public static void calculate(int year){
        if (year % 4 == 0){
            System.out.println("its a leap year");
        } else if(year % 100 == 0 && year % 400 == 0){
            System.out.println("its a leap year");
        } else {
            System.out.println("its not a leap year");
        }
    }
}
