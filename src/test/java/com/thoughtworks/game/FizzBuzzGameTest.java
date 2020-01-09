package com.thoughtworks.game;


import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;

public class FizzBuzzGameTest {
    private static final String WHIZZ = "Whizz";
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    @Test
    public void should_return_Fizz_when_input_3() {
//        given
//        when
        String result = FizzBuzzGame.fizzBuzz(3);

//        then
        assertEquals(FIZZ, result);
    }

    @Test
    public void should_return_Buzz_when_input_5() {
//        given
//        when
        String result = FizzBuzzGame.fizzBuzz(5);

//        then
        assertEquals(BUZZ, result);
    }

    @Test
    public void should_return_Whizz_when_input_7() {
//        given
//        when
        String result = FizzBuzzGame.fizzBuzz(7);

//        then
        assertEquals(WHIZZ, result);
    }

    @Test
    public void should_return_itself_when_input_other_number_that_are_not_multiple_of_special_number_given_input_number_between_1_to_120() {
//        given
        List<Integer> resources = Stream
                .iterate(1, n -> n + 1)
                .limit(120)
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
    public void name() {
    }
}
