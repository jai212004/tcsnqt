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
        System.out.println(isPalindrome(1101));
        System.out.println(isArmstrong(153));
        System.out.println(fact(5));
        System.out.println(isStrongNumber(90));
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
}