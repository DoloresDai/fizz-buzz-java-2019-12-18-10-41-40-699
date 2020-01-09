package com.thoughtworks.game;


import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static com.thoughtworks.game.FizzBuzzGame.answer;
import static com.thoughtworks.game.FizzBuzzGame.specialNumber;
import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;

public class FizzBuzzGameTest {

    @Test
    public void should_return_correct_answer_when_input_single_special_number() {
        List<String> expect = specialNumber
                .stream()
                .map(FizzBuzzGame::fizzBuzz)
                .collect(toList());

        assertEquals(expect, answer);
    }

    @Test
    public void should_return_itself_when_input_other_number_that_are_not_multiple_of_special_number_given_input_number_between_1_to_120() {
//        given
        List<Integer> resources = getLimitList()
                .filter(n -> !((n % 3 == 0) | (n % 5 == 0) | (n % 7 == 0)))
                .collect(toList());

        List<String> expect = resources
                .stream()
                .map(Object::toString)
                .collect(toList());
//        when
        List<String> result = resources
                .stream()
                .map(FizzBuzzGame::fizzBuzz)
                .collect(toList());

//        then
        assertEquals(expect, result);
    }

    @Test
    public void should_return_relatively_answer_when_input_multiple_number_of_special_number() {
//        given
        List<Integer> resources = getLimitList()
                .filter(this::ifMultipleNumber)
                .collect(toList());

        List<String> expect = resources
                .stream()
                .map(n -> {
                    if (n % 3 == 0) {
                        return "Fizz";
                    } else if (n % 5 == 0) {
                        return "Buzz";
                    } else if (n % 7 == 0) {
                        return "Whizz";
                    }
                    return n.toString();
                })
                .collect(toList());

//        when
        List<String> result = resources
                .stream()
                .map(FizzBuzzGame::fizzBuzz)
                .collect(toList());

//        then
        assertEquals(expect, result);
    }

    private boolean ifMultipleNumber(Integer number) {
        return specialNumber.stream().anyMatch(n -> number % n == 0);
    }

    private Stream<Integer> getLimitList() {
        return Stream.iterate(1, n -> n + 1).limit(120);
    }
}
