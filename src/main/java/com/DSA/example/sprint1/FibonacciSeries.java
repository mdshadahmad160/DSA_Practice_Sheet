package com.DSA.example.sprint1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shad Ahmad
 * 5. Generating the Fibonacci Series
 * Difficulty: Easy
 * Topics: Basic Programming, Sequences
 * Description: Write a program to generate the Fibonacci series up to a given number.
 * Example:
 * Input: limit = 10
 * Output: [0, 1, 1, 2, 3, 5, 8]
 * Explanation: The Fibonacci series up to 10 is generated as [0, 1, 1, 2, 3, 5, 8].
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        int limit = 10;
        List<Integer> fibonacci = new ArrayList<>();
        int a = 0, b = 1;
        fibonacci.add(a);
        fibonacci.add(b);
        while (true) {
            int next = a + b;
            if (next > limit)
                break;
            fibonacci.add(next);
            a = b;
            b = next;
        }
        System.out.println(fibonacci);
    }
}
