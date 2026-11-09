/*
you are given an integer n. You need to check whether the number is a palindrome number or not. Return true if it's a palindrome number, otherwise return false.

A palindrome number is a number which reads the same both left to right and right to left.

Example 1:
Input: n = 121

Output: true

Explanation: When read from left to right : 121.

When read from right to left : 121.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1101));
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
        if(sum==orig){
            return true;
        }else{
            return false;
        }
    }
}