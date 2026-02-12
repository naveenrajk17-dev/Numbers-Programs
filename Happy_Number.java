public class Happy_Number {
    public static boolean isHappy(int n) {
        while(n!=1 && n!=4){
            int sum=0;
            while(n>0){
                sum +=(n%10)*(n%10);
                n=n/10;
            }
            n=sum;
        }
        return n==1;
    }
    public static void main(String[] args) {
        int n=19;
        System.out.println(isHappy(n) ? "Happy" : "Unhappy");
    }
}
