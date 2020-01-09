package com.thoughtworks.game;


import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static com.thoughtworks.game.FizzBuzzGame.*;
import static com.thoughtworks.game.FizzBuzzGame.answer;
import static com.thoughtworks.game.FizzBuzzGame.specialNumber;
import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;

public class FizzBuzzGameTest {

    @Test
    public void should_return_correct_answer_when_input_single_special_number() {
        List<String> result = specialNumber
                .stream()
                .map(FizzBuzzGame::fizzBuzz)
                .collect(toList());

        assertEquals(answer, result);
    }

    @Test
    public void should_return_itself_when_input_other_number_that_are_not_multiple_of_special_number_given_input_number_between_1_to_120() {
//        given
        List<Integer> resources = getLimitList()
                .filter(number -> specialNumber.stream().allMatch(n -> number % n != 0))
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
        assertEquals("Fizz", fizzBuzz(9));
        assertEquals("Buzz", fizzBuzz(10));
        assertEquals("Whizz", fizzBuzz(14));
    }

    @Test
    public void should_return_combination_answer_when_input_multiple_number_of_special_numbers() {
        assertEquals("FizzBuzz", fizzBuzz(15));
        assertEquals("FizzWhizz", fizzBuzz(21));
        assertEquals("BuzzWhizz", fizzBuzz(35));
    }

    @Test
    public void should_return_Fizz_when_input_30() {
        assertEquals("Fizz", fizzBuzz(30));
    }

    private Stream<Integer> getLimitList() {
        return Stream.iterate(1, n -> n + 1).limit(120);
    }
}
