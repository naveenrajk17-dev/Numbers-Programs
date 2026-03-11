/*
Example 1:

Input: x = 18

Output: 9

Explanation:

The sum of digits of x is 9. 18 is divisible by 9. So 18 is a Harshad number and the answer is 9.

Example 2:

Input: x = 23

Output: -1

Explanation:

The sum of digits of x is 5. 23 is not divisible by 5. So 23 is not a Harshad number and the answer is -1. */

public class Harshad_Number {
    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp=x;
        int sum=0;

        while(temp>0)
        {
            int digit=temp % 10;
            sum +=digit;
            temp /=10;
        }
        return (x % sum ==0) ? sum : -1;
    }
    public static void main(String[] args) {
        int x = 18;
        System.out.println(sumOfTheDigitsOfHarshadNumber(x));
    }
}
