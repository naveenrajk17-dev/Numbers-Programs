/*
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0]. */

import java.util.Arrays;

public class Plus_One {
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--)
        {
           digits[i]++;
           if(digits[i]<10){
            return digits;
           }
           digits[i]=0;
           
        }
       
        int[] arr=new int[digits.length+1];
        arr[0]=1;
        return arr;
    }
    public static void main(String[] args) {
        int[] digits = {4,3,2,1};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
