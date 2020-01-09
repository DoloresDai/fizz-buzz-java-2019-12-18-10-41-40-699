package com.thoughtworks.game;

class FizzBuzzGame {
    static final String WHIZZ = "Whizz";
    static final String FIZZ = "Fizz";
    static final String BUZZ = "Buzz";

    static String fizzBuzz(Integer number) {
        if (number.equals(3)) {
            return FIZZ;
        } else if (number.equals(5)) {
            return BUZZ;
        } else if (number.equals(7)) {
            return WHIZZ;
        }
        return number.toString();
    }
}
