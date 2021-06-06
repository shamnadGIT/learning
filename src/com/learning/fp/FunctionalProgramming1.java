package com.learning.fp;

import java.util.stream.IntStream;

public class FunctionalProgramming1 {

    public static void main(String[] args) {
        System.out.println(isPrimeFP(1));
        System.out.println(isPrimeFP(2));
        System.out.println(isPrimeFP(3));
        System.out.println(isPrimeFP(4));
        System.out.println(isPrimeFP(5));

    }

    //The imperative approach focus on solution ..focus on the iteration
    //sequential in nature with for loop
    //need to define the i always which we are not using..
    private static boolean isPrimeTraditional(int number) {

        //imperative -  saying how to do
        //mutability - so many moving parts like the i anc counter condition checks..and hard to make the code concurrent
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number > 1;
    }

    //the functional programming approach focus on the problem statement
    //declarative rather than imperative - just tell what to do rather than how to do
    //immutability -
    private static boolean isPrimeFP(int number) {
        return number > 1 && IntStream.range(2, number).noneMatch(index -> number % index == 0);

        //index -> number % index == 0 is the Predicate which will check for a condition to evaluate accepting one argument which is
        //the index..

        //if needed and if there are lot of number we can do it in parallel, which will improve performance
        ////return number > 1 && IntStream.range(2,number).parallel().noneMatch(index -> number % index == 0);
    }
}
