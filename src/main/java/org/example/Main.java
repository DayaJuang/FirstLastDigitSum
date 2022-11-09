package org.example;

public class Main {
    public static void main(String[] args) {
        int ans = sumFirstAndLastDigit(-12);
        System.out.println(ans);
    }

    public static int sumFirstAndLastDigit(int num){
        // Check if the number is positive
        if(num < 0)
            return -1;

        // Calculate the sum of first and last number
        int first = 0;
        int last = num % 10;   // Find the last digit of number

        // Find the first digit of number
        while (num > 0){
            first = num % 10;
            num /= 10;
        }

        return first + last;
    }
}