package com.learning.fp;

import java.util.Arrays;
import java.util.List;

public class SampleFPWithStreamAndMethodReference {

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
        Integer integer = numbers.stream() // stream is a fancy iterator in jav 8
                .filter(SampleFPWithStreamAndMethodReference::isGreaterThan3)// filter items which is greater than 3
                .filter(SampleFPWithStreamAndMethodReference::isEven) // filter items which are even
                .map(SampleFPWithStreamAndMethodReference::doubleIt) // calculate double and map it
                .findAny() // gets any item which is Optional
                .get();
        return integer; // get the int item

        //filter and map etc.. are called intermediate operations
        //findAny,collect,reduce are called terminal operation

    }
}
