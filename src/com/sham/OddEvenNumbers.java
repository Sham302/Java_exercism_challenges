package com.sham;

import java.util.ArrayList;
import java.util.List;

public class OddEvenNumbers {
    public void printNumber() {
        int n = 10;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                System.out.println(i + "is an odd number!");
            } else if (i % 2 == 0) {
                System.out.println(i + " is an even number!");
            }
        }
    }
}
