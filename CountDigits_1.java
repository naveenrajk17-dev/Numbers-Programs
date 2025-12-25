import java.util.Scanner;
public class CountDigits_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int digits=sc.nextInt();
        int count=0;
        int number=Math.abs(digits);

        if(number==0){
            count=1;
        }
        else{
            while(number>0)
            {
            number=number / 10;
            count++;
            }
        }
        
        System.out.println("the Total Count :"+count);
    }
    
}
