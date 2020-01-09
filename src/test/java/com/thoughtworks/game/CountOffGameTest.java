package com.thoughtworks.game;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;

public class CountOffGameTest {
    @Test
    public void should_return_itself_when_input_not_special_number_given_input_single_number_but_not_0() {
//        given
        String[] sources = {"1", "2", "4", "6", "8", "9"};
        List<String> expect = Arrays.asList(sources);

//        when
        List<String> result = expect
                .stream()
                .map(CountOffGame::countOff)
                .collect(toList());

//        then
        assertEquals(expect, result);
    }

    @Test
    public void should_return_Fizz_when_input_3() {
//        given
//        when
        String result = CountOffGame.countOff("3");
        String expect = CountOffGame.FIZZ;

//        then
        assertEquals(expect, result);
    }
}
