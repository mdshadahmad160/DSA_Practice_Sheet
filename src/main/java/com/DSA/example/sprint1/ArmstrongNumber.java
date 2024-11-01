package com.DSA.example.sprint1;

/**
 * @author Shad Ahmad
 * 4. Calculating Armstrong Numbers
 * Difficulty: Easy
 * Topics: Basic Programming, Number Theory
 * Description: Write a program to check if a number is an Armstrong number.
 * Example:
 * Input: number = 153
 * Output: Armstrong Number
 * Explanation: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;//it will gave us the last digit number like 3, 5 1 like this
            sum += Math.pow(digit, digits);
            number /= 10;//it will remove the last digit no like 153 remove 15 ,1 like this
        }
        System.out.println(sum == original ? "Armstrong Number" : "Not an Armstrong Number");

    }
}
