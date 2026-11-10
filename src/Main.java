/*
you are given an integer n. You need to check whether the number is a palindrome number or not. Return true if it's a palindrome number, otherwise return false.

A palindrome number is a number which reads the same both left to right and right to left.

Example 1:
Input: n = 121
Output: true

Explanation: When read from left to right : 121.

When read from right to left : 121.

https://takeuforward.org/blogs/interview-preparation/tcs-nqt-sheet?open=17216%2C17215
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(addDigits(529));
        String s = "391";
        System.out.println(s.charAt(2) - '0' + s.charAt(1) - '0');
        System.out.println(replaceZerosWithOnes(0000));
        System.out.println(LCM(25 , 30));
    }
    public static boolean isPalindrome(int n) {
        int orig = n;
        int sum = 0;
        while(n!=0){
            int divisor = n/10;
            int remain = n%10;
            sum = sum*10 + remain;
            n=divisor;
        }
        System.out.println(sum);
        if(sum==orig){
            return true;
        }else{
            return false;
        }
    }

    /*
    You are given an integer n. You need to check whether it is an armstrong number or not. Return true if it is an armstrong number, otherwise return false.

An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.

Example 1:
Input: n = 153

Output: true

Explanation: Number of digits : 3.

13 + 53 + 33 = 1 + 125 + 27 = 153.

Therefore, it is an Armstrong number.
     */
    public static boolean isArmstrong(int n) {
        int orig = n;
        int count = 0;
        int n1 = n;
        int sum = 0;
        while(n!=0){
            n=n/10;
            count++;
        }
        while(n1!=0){
            int remain = n1%10;
            sum = sum + (int)Math.pow(remain , count);
            n1=n1/10;
        }
        if(sum==orig){
            return true;
        }else{
            return false;
        }
    }
    /*
    Given a positive integer N, determine whether it is a Strong Number or not.

A number is considered a Strong Number if the sum of the factorial of its digits is equal to the number itself.

Return "Yes" if the number is a Strong Number, else return "No".

Example 1:
Input: 145

Output: Yes

Explanation:

1! + 4! + 5! = 1 + 24 + 120 = 145, so it is a Strong Number.
     */

    public static String isStrongNumber(int n) {
        int sum = 0;
        int orig = n;
        while(n!=0){
            int remain = n%10;
            sum = sum + fact(remain);
            n=n/10;
        }
        if(sum == orig){
            return "Yes";
        }else{
            return "No";
        }
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    /*
    You are given an integer n. You need to check if the number is a perfect number or not. Return true if it is a perfect number, otherwise, return false.

A perfect number is a number whose proper divisors (excluding the number itself) add up to the number itself.

Example 1:
Input: n = 6

Output: true

Explanation: Proper divisors of 6 are 1, 2, 3.

1 + 2 + 3 = 6.

Example 2:
Input: n = 4

Output: false

Explanation: Proper divisors of 4 are 1, 2.

1 + 2 = 3.
     */
    public static boolean isPerfect(int n) {
        int orig = n;
        int sum = 0;
        int divisor = 1;
        while(divisor<=Math.sqrt(n)){
            if(n%divisor==0){
                sum=sum+divisor;
                if(n%(n/divisor)==0 && n/divisor!=divisor){
                    sum=sum+(n/divisor);
                }
            }
            divisor++;
        }
        sum=sum-orig;
        System.out.println(sum);
        if(sum==orig){
            return true;
        }
        else{
            return false;
        }
    }
    /*
    Given a positive integer N, determine whether it is a Harshad number (also known as a Niven number) or not.

A number is said to be a Harshad number if it is divisible by the sum of its digits.

Example 1:
Input: 378

Output: true

Explanation:

﻿Sum of digits = 3 + 7 + 8 = 18
378 is divisible by 18 → 378 % 18 == 0
So, it is a Harshad number.
     */
    public static boolean isHarshad(int n) {
        int orig = n;
        int sum = 0;
        while(n!=0){
            int remain = n%10;
            sum = sum+remain;
            n=n/10;
        }
        if(orig%sum==0){
            return true;
        }else{
            return false;
        }
    }
    /*
    Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Example 1:
Input : num = 529

Output : 7

Explanation : In first iteration the digits sum will be = 5 + 2 + 9 => 16

In second iteration the digits sum will be 1 + 6 => 7.

Now single digit is remaining , so we return it.


     */
    public static int addDigits(int num) {
        if (num % 10 == num) {
            return num;
        } else {
            int sum = 0;
            while (num != 0) {
                int remain = num % 10;
                num = num / 10;
                sum = sum + remain;
            }
            return addDigits(sum);
        }
    }
    /*
    You are given a string s representing a large non-negative integer, return true if it is divisible by 9, otherwise return false.

Due to the large size of the number, you cannot store it in standard numeric data types like int, long, or long long. You must process it as a string.

A number is divisible by 9 if and only if the sum of its digits is divisible by 9.

Example 1:
Input: s = "69354"

Output: true

Explanation: 6+9+3+5+4 = 27, which is divisible by 9.
     */
    public static boolean isDivisibleBy9(String s) {
        int sum = 0;
        for (int i = 0 ; i < s.length() ; i++){
            sum = sum + s.charAt(i) - '0';
        }
        if(sum%9==0){
            return true;
        }else{
            return false;
        }
    }
    /*
    You are given an integer N. Your task is to return the integer formed by replacing every digit 0 with 1 in the decimal representation of N.

Example 1:
Input: N = 102003

Output: 112113

Explanation: 0s at 2nd, 4th and 5th positions are replaced with 1.
     */
    public static int replaceZerosWithOnes(int N) {
        int count = 0;
        int orig = N;
        while(N!=0){
            int remain = N%10;
            if(remain==0){
                orig = orig + (int)Math.pow(10 , count);
            }
            count++;
            N=N/10;
        }
        return orig;
    }
    /*
    You are given two integers n1 and n2. You need find the Greatest Common Divisor (GCD) of the two given numbers. Return the GCD of the two numbers.

The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both of the integers.

Example 1:
Input: n1 = 4, n2 = 6

Output: 2

Explanation: Divisors of n1 = 1, 2, 4, Divisors of n2 = 1, 2, 3, 6

Greatest Common divisor = 2.
     */
    public static int GCD(int n1, int n2) {
        while(n1!=n2){
            if(n1>n2){
                n1=n1-n2;
            }else{
                n2=n2-n1;
            }
        }
        return n1;
    }
    /*
    optimal approach euclidean theorem -> subtract small from large untill both numbers become same , return that same number.
     */
    /*
    You are given two integers n1 and n2. You need find the Lowest Common Multiple (LCM) of the two given numbers. Return the LCM of the two numbers.

The Lowest Common Multiple (LCM) of two integers is the lowest positive integer that is divisible by both the integers.

Example 1:
Input: n1 = 4, n2 = 6

Output: 12

Explanation: 4 * 3 = 12, 6 * 2 = 12.

12 is the lowest integer that is divisible both 4 and 6.
     */
    public static int LCM(int n1, int n2) {
        int Lcm = (n1*n2)/GCD(n1,n2);
        return Lcm;
    }
    /*
    optimal approach = hcf(n1,n2) * lcm(n1,n2) = n1*n2
     */
}