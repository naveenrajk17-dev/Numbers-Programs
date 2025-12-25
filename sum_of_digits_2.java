import java.util.Scanner;
public class sum_of_digits_2 {
   public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number : ");
   int number=sc.nextInt();
   int sum=0;
   if(number==0){
    System.out.println("the sum :"+sum);
   }
   else{
    while(number>0){
        sum +=number%10;
        number /=10;
    }
   }
   System.out.println("the sum :"+sum);
   }
}
