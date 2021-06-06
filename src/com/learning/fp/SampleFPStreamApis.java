package com.learning.fp;

import java.util.Arrays;
import java.util.List;

public class SampleFPStreamApis {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8);
        // List<Integer> numbers = Arrays.asList(1,2,3);//,5,4,6,7,8);
        System.out.println(findDoubleOfTheFirstEvenNumberWhichISGreaterThan3(numbers));
        System.out.println(findDoubleOfTheFirstEvenNumberWhichISGreaterThan3FP(numbers));
    }

    //Normal Iteration to find out the solution
    //approach doesnt consider the boundary conditions what happens if the input is // List<Integer> numbers = Arrays.asList(1,2,3);//,5,4,6,7,8);
    //this approach fails but the FP approach gives a good optional item..
    private static int findDoubleOfTheFirstEvenNumberWhichISGreaterThan3(List<Integer> numbers) {
        int result = 0;
        for (int num : numbers
        ) {

            if (num > 3 && num % 2 == 0) {
                result = num * 2;
                break;
            }
        }


        return result;


    }

    private static int findDoubleOfTheFirstEvenNumberWhichISGreaterThan3FP(List<Integer> numbers) {

        return numbers.stream() // stream is a fancy iterator in jav 8
                .filter(e -> e > 3) // filter items which is greater than 3
                .filter(e -> e % 2 == 0) // filter items which are even
                .map(e -> e * 2) // calculate double and map it
                .findAny() // gets any item which is Optional
                .get(); // get the int item

    }
}
