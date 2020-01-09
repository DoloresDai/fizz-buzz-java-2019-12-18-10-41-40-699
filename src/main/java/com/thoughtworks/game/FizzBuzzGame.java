package com.thoughtworks.game;

import java.util.Arrays;
import java.util.List;

class FizzBuzzGame {
    private static final List<String> answer = Arrays.asList("Fizz", "Buzz", "Whizz");
    private static final List<Integer> specialNumber = Arrays.asList(3, 5, 7);


    static String fizzBuzz(Integer number) {
        if (specialNumber.contains(number)) {
            return getCorrectAnswer(number);
        } else if (number % 3 == 0) {
            return "Fizz";
        }
        return number.toString();
    }

    private static String getCorrectAnswer(Integer number) {
        return answer.get(specialNumber.indexOf(number));
    }

}
