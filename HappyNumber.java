/*
* Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example:

Input: 19
Output: true
* */

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(96));
    }

    private static boolean isHappy(int n){
        int value = 0;
        while(true){
            int i = n % 10;
            value += i * i;
            n = n / 10;
            if(value == 1 && n == 0){
                return true;
            }
            if(n == 0){
                n = value;
                value = 0;
            }
        }
    }
}
