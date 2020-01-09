package com.thoughtworks.game;

class CountOffGame {
    static final String FIZZ = "Fizz";

    static String countOff(String number) {
        if (number.equals("3")) {
            return FIZZ;
        }
        return number;
    }
}
