/*
Example 1:

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
Example 2:

Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
Example 3:

Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3. */
public class Fibonacci_Number{
    public static int fib(int n) {
        int first=0;
        int second=1;
        int sum=0;

        if(n<=1){
            return n;
        }
        for(int i=2;i<=n;i++)
        {
            sum = first+second;
            first=second;
            second=sum;
        }
        return second;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fib(n));
    }
}