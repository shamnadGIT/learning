package com.learning.fp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SampleFPWithStreamAndMethodReferencePredicateReturn {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8);
        // List<Integer> numbers = Arrays.asList(1,2,3);//,5,4,6,7,8);
        //System.out.println(findDoubleOfTheFirstEvenNumberWhichISGreaterThan3(numbers));
        System.out.println(findDoubleOfTheFirstEvenNumberWhichISGreaterThan3FP(numbers));
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static boolean isGreaterThan3(int number) {
        return number > 3;
    }

    private static int doubleIt(int number) {
        return number * 2;
    }

    private static int findDoubleOfTheFirstEvenNumberWhichISGreaterThan3FP(List<Integer> numbers) {
        //Higher order functions- providing functions to function
        //lazy and composition

        //Predicate<Integer> isGreaterThan3 = number -> number > 3;
        Predicate<Integer> isEven = number -> number % 2 == 0;

        Function<Integer, Predicate<Integer>> isGreaterThan = pivot -> number -> number > pivot;

        Stream<Integer> temp = numbers.stream() // stream is a fancy iterator in jav 8
                .filter(isGreaterThan.apply(7))// filter items which is greater than 3.. this is eager now
                .filter(isEven) // filter items which are even
                .map(SampleFPWithStreamAndMethodReferencePredicateReturn::doubleIt); // calculate double and map it
        return temp
                .findAny() // gets any item which is Optional
                .get(); // get the int item


        //filter and map etc.. are called intermediate operations
        //findAny,collect,reduce are called terminal operation

    }
}
