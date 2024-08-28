package com.prep.basic;

/*
    - Java program to print the fibonacci series between given range.
    - The Fibonacci series is a series of elements where, the previous two elements
      are added to get the next element, starting with 0 and 1.
    - Examples of Fibonacci Series in Java
        Input: N = 9
        Output: 0 1 1 2 3 5 8 13 21
        Explanation: Here first term of Fibonacci is 0 and second is 1,
                     so that 3rd term = first(o) + second(1) etc and so on.
*/
public class FibonacciSeries {
    public static void main(String[] args) {
        int input = 9;
        printFibonacciSeries(input);
    }

    private static void printFibonacciSeries(int input) {
        int first = 0;
        int second = 1;

        for (int i = 0; i < 9; i++){
            System.out.println(first+" ");

            int third = first + second;
            first = second;
            second = third;

        }
    }
}