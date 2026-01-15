import java.util.*;
/*
Example 1:

Input: n = 50

Output: [1,2]

Explanation:

The binary representation of 50 is 110010.

It contains 1 on indices 1, 4, and 5.

Example 2:

Input: n = 2

Output: [0,1]

Explanation:

The binary representation of 2 is 10.

It contains 1 only on index 1. */
public class Number_of_Even_and_Odd_Bits {
    public static int[] evenOddBit(int n) {
    
        int even=0,odd=0,pos=0;
        while(n>0){
            if((n&1)==1){
                if(pos%2==0){even++;}
                else{odd++;}
            }
            n >>=1;
            pos++;

        }
        return new int[]{even,odd};
    }
/*String str=Integer.toBinaryString(n);
        int len=str.length();
        int even=0,odd=0;
        for(int i=len-1;i>=0;i--){
            if(str.charAt(i)=='1'){
                int pos=len-i-1;
                if(pos%2==0){even++;}
                else{odd++;}
            }
        }
        return new int[]{even,odd}; 
*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println(Arrays.toString(evenOddBit(n)));
    }
}
