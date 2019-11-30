package com.sham.Challenge1;

public class TwoFer {
    public void message(String name){

        if (name != null){
            System.out.println("One for " + name + " one for me");
        }else{
            System.out.println("One for you, one for me!");
        }

    }
}


//import static java.util.Optional.ofNullable;
//
//class Twofer {
//    String twofer(String name) {
//        return String.format("One for %s, one for me.", ofNullable(name).orElse("you"));
//    }
//}