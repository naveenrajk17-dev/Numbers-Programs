/*
Example 1:

Input: num = 3749

Output: "MMMDCCXLIX"

Explanation:

3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
 700 = DCC as 500 (D) + 100 (C) + 100 (C)
  40 = XL as 10 (X) less of 50 (L)
   9 = IX as 1 (I) less of 10 (X)
Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places
Example 2:

Input: num = 58

Output: "LVIII"

Explanation:

50 = L
 8 = VIII
Example 3:

Input: num = 1994

Output: "MCMXCIV"
*/public class Integer_to_Roman {
    public static String intToRoman(int num) {
        int[] value={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] Roman={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<value.length;i++){
            while(num>=value[i]){
                num=num-value[i];
                sb.append(Roman[i]);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int num = 3749;   // test input
        String result = intToRoman(num);

        System.out.println("Integer: " + num);
        System.out.println("Roman  : " + result);
    }
}
