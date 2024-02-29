import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=scanner.nextInt();
        int sum=0;
        int originalNumber=n;
        while (n!=0) {
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        System.out.println("Sum of digits of"+ originalNumber+"is:"+sum);
        scanner.close();
    }
}
