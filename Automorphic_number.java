import java.util.Scanner;

public class Automorphic_number {
    public static boolean Automorphic(int num)
    {
        int square=num*num;
        while(num > 0)
        {
            if(num%10 != square%10)
            {
                return false;
            }
            num = num/10;
            square = square/10;
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num=sc.nextInt();
        if(Automorphic(num))
        {
            System.out.println("Automorphic number");
        }
        else{
            System.out.println("Not Automorphic number");
        }
    }
}
