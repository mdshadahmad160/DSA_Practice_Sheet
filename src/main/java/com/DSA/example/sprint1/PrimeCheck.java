package com.DSA.example.sprint1;

/**
 * @author Shad Ahmad
 * 2. Checking for Prime Numbers
 * Difficulty: Easy
 * Topics: Basic Programming, Number Theory
 * Description: Write a program to determine if a number is prime.
 * Example:
 * Input: number = 7
 * Output: Prime
 * Explanation: 7 has no divisors other than 1 and itself, so it is a prime number.
 */
public class PrimeCheck {
    public static void main(String[] args) {
        int number = 7;
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(isPrime ? "Prime  " : "Not Prime");
    }
}
