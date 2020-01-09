package com.thoughtworks.game;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

class FizzBuzzGame {
    static final List<String> answer = Arrays.asList("Fizz", "Buzz", "Whizz");
    static final List<Integer> specialNumber = Arrays.asList(3, 5, 7);


    static String fizzBuzz(Integer number) {
        List<Integer> multipleList = getFilterList(isMultipleNumber(number));
        List<Integer> contain3List = getFilterList(multipleList, isContainsNumber(number, 3));
        List<Integer> contain5List = getFilterList(multipleList, isContainsNumber(number, 5));
        List<Integer> contain7List = getFilterList(multipleList, isContainsNumber(number, 7));

        if (multipleList.size() > 0) {
            if (contain7List.size() > 0) {
                return "Whizz";
            } else if (contain3List.size() > 0) {
                if (contain5List.size() > 0) {
                    return getJoining(contain5List);

                }
                return "Fizz";
            }
            return getJoining(multipleList);
        }
        return number.toString();
    }

    private static List<Integer> getFilterList(List<Integer> list, boolean filter) {
        return list
                .stream()
                .filter(n -> filter)
                .collect(toList());
    }

    private static List<Integer> getFilterList(Predicate<Integer> filter) {
        return specialNumber
                .stream()
                .filter(filter)
                .collect(toList());
    }

    private static Predicate<Integer> isMultipleNumber(Integer number) {
        return n -> number % n == 0;
    }

    private static boolean isContainsNumber(Integer number, Integer special) {
        return number.toString().contains(special.toString());
    }

    private static String getCorrectAnswer(Integer number) {
        return answer.get(specialNumber.indexOf(number));
    }

    private static String getJoining(List<Integer> list) {
        return list
                .stream()
                .map(FizzBuzzGame::getCorrectAnswer)
                .collect(Collectors.joining());
    }
}
