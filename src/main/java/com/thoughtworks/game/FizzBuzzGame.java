package com.thoughtworks.game;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

class FizzBuzzGame {
    static final List<String> answer = Arrays.asList("Fizz", "Buzz", "Whizz");
    static final List<Integer> specialNumber = Arrays.asList(3, 5, 7);


    static String fizzBuzz(Integer number) {
        List<Integer> isMultipleNumber = specialNumber
                .stream()
                .filter(n -> number % n == 0)
                .collect(toList());

        if (isMultipleNumber.size() > 0) {
            return isMultipleNumber
                    .stream()
                    .map(FizzBuzzGame::getCorrectAnswer)
                    .collect(Collectors.joining());
        }
        return number.toString();
    }

    private static String getCorrectAnswer(Integer number) {
        return answer.get(specialNumber.indexOf(number));
    }


}
