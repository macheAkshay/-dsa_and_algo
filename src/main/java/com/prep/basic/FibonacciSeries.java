package com.prep.basic;

/*

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