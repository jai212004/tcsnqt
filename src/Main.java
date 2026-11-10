import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
you are given an integer n. You need to check whether the number is a palindrome number or not.
 Return true if it's a palindrome number, otherwise return false.

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
        String a = "5/1";
        String b = "3/4";
        System.out.println(permutations(20 , 20));
        System.out.println(primeTillN(100));
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
    You are given an integer n. You need to check whether it is an armstrong number or not.
     Return true if it is an armstrong number, otherwise return false.

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
    You are given an integer n. You need to check if the number is a perfect number or not. Return
     true if it is a perfect number, otherwise, return false.

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

Due to the large size of the number, you cannot store it in standard numeric data types like int, long, or
 long long. You must process it as a string.

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
    You are given an integer N. Your task is to return the integer formed by replacing every digit
    0 with 1 in the decimal representation of N.

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
    You are given two integers n1 and n2. You need find the Greatest Common Divisor (GCD)
     of the two given numbers. Return the GCD of the two numbers.

The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both of the integers.

Example 1:
Input: n1 = 4, n2 = 6

Output: 2

Explanation: Divisors of n1 = 1, 2, 4, Divisors of n2 = 1, 2, 3, 6

Greatest Common divisor = 2.
     */
    public static int GCD1(int n1, int n2) {
        while(n1!=n2){
            if(n1>n2){
                n1=n1-n2;
            }else{
                n2=n2-n1;
            }
        }
        return n1;
    }

    public static int GCD(int n1 , int n2){
        while(n2!=0){
            int temp = n2;
            n2 = n1%n2;
            n1 = temp;
        }
        return n1;
    }
    /*
    optimal approach euclidean theorem -> subtract small from large untill both numbers become same , return that same number.
     */
    /*
    You are given two integers n1 and n2. You need find the Lowest Common Multiple (LCM)
    of the two given numbers. Return the LCM of the two numbers.

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
    public static int LCMbrute(int n1 , int n2){
        int lcm = n1;
        int min = n1;
        if(n1>n2){
            min = n2;
        }
        while(true) {
            if (min % n1 == 0 && min % n2 == 0){
                lcm = min;
                break;
            }
            min++;
        }
        return lcm;
    }
    /*
    You are given two fractions as strings in the form "a/b" and "c/d" where a, b, c, and d are positive integers and b ≠ 0, d ≠ 0.

Your task is to add the two fractions and return their sum in the simplest form as a string "x/y".

Example 1:
Input: frac1 = "3/4", frac2 = "1/7"

Output: "25/28"

Explanation: 3/4 + 1/7 = (3×7 + 1×4)/(4×7) = 25/28
     */
    public static String addFractions(String word1, String word2) {
        int break1 = 0;
        int break2 = 0;
        for(int i = 0 ; i < word1.length() ; i++){
            if(word1.charAt(i)=='/'){
                break1=i;
                break;
            }
        }
        for(int i = 0 ; i < word2.length() ; i++){
            if(word2.charAt(i)=='/'){
                break2=i;
                break;
            }
        }
        int a1 = conToInt(word1.substring(0, break1));
        int a2 = conToInt(word1.substring(break1+1));
        int b1 = conToInt(word2.substring(0, break2));
        int b2 = conToInt(word2.substring(break2+1));
        //((a1*b2)+(a2*b1))/b2*b1
        int num = a1*b2 + a2*b1;
        int denom = a2*b2;
        System.out.println(num);
        System.out.println(denom);
        int hcf = GCD(num , denom);
        if(num%denom==0){
            num = num/denom;
            denom = 1;
        }else{
//        System.out.println(num);
//        System.out.println(denom);
//        System.out.println(hcf);
        num = num/hcf;
        denom = denom/hcf;
        }
        String res = num + "/" + denom;
        return res;
    }

    public static int conToInt(String word){
        int sum = 0;
        int length = word.length();
        for(int i = 0 ; i<length ; i++){
            int remain = (word.charAt(i)-'0');
            sum = sum*10+remain;
            //System.out.println(sum);
        }
        return sum;
    }
    /*
    You are given an integer n. You need to find all the divisors of n. Return all the divisors of n as an array or list in a sorted order.

A number which completely divides another number is called it's divisor.

Example 1:
Input: n = 6

Output = [1, 2, 3, 6]

Explanation: The divisors of 6 are 1, 2, 3, 6.
     */
    public static int[] divisors(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1 ; i <= Math.sqrt(n) ; i++){
            if(n%i==0){
                if((n/i)==i){
                    arr.add(i);
                    continue;
                }
                arr.add(i);
                arr.add(n/i);
            }
        }
        int length = arr.size();
        int[] arrr = new int[length];
        for(int i = 0 ; i < length ; i++){
            arrr[i] = arr.get(i);
        }
        Arrays.sort(arrr);
        return arrr;
    }
    /*
    You are given two integers N and R representing the number of people and the number of
     available seats respectively. Your task is to find the number of permutations in which these N people can occupy the R seats.

Please provide your answer with mod of (109 + 7).

Example 1:
Input: N = 5, R = 3

Output: 60

Explanation: P(5, 3) = 5! / (5 - 3)! = 120 / 2 = 60
     */
    public static long permutations(int n, int r) {
        long modu = 1_000_000_007L;
        long result = 1;
        for(int i = n ; i > n-r ; i--){
            result = (result*i)%modu;
        }
        return result;
    }
    /*
    You are given an integer n.

Print all the prime numbers till n (including n).

A prime number is a number that has only two divisor's 1 and the number itself.

Example 1:
Input : n = 7

Output : [2, 3, 5, 7]

Explanation : The number 2 has only two divisors 1 and 2.

The number 3 has only two divisors 1 and 3.

The number 5 has only two divisors 1 and 5.

The number 7 has only two divisors 1 and 7.
     */
    public static ArrayList<Integer> primeTillN(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime , true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(isPrime[i]){
                for(int j = i*i ; j <= n ; j=j+i){
                    isPrime[j]=false;
                }
            }
        }
        for(int i = 0 ; i <= n ; i++){
            if(isPrime[i]){
                arr.add(i);
            }
        }
        return arr;
        /*
        Every composite number n can be written as a × b with a factor of at most √n (other than 1), so the sieve only
        needs to cross out multiples of numbers up to √n, because the other factor in each pair is just the same pair flipped.
         */
    }

}