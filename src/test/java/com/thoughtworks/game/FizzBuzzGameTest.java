package com.thoughtworks.game;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;

public class FizzBuzzGameTest {
    @Test
    public void should_return_itself_when_input_not_special_number_given_input_single_number_but_not_0() {
//        given
        Integer[] sources = {1, 2, 4, 6, 8, 9};
        List<String> expect = Arrays
                .stream(sources)
                .map(Object::toString)
                .collect(toList());

//        when
        List<String> result = Arrays.stream(sources)
                .map(FizzBuzzGame::fizzBuzz)
                .collect(toList());

//        then
        assertEquals(expect, result);
    }

    @Test
    public void should_return_Fizz_when_input_3() {
//        given
//        when
        String expect = FizzBuzzGame.FIZZ;
        String result = FizzBuzzGame.fizzBuzz(3);

//        then
        assertEquals(expect, result);
    }

    @Test
    public void should_return_Buzz_when_input_5() {
//        given
//        when
        String expect = FizzBuzzGame.BUZZ;
        String result = FizzBuzzGame.fizzBuzz(5);

//        then
        assertEquals(expect, result);
    }

    @Test
    public void should_return_Whizz_when_input_7() {
//        given
//        when
        String expect = FizzBuzzGame.WHIZZ;
        String result = FizzBuzzGame.fizzBuzz(7);

//        then
        assertEquals(expect, result);
    }
}
