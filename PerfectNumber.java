import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=scanner.nextInt();
        int count=0;
        for (int i=1;i<number;i++) {
            if (number%i==0) {
                count += i;
            }
        }
        if (count==number) {
            System.out.println(number+"is a perfect number.");
        } else {
            System.out.println(number+"is not a perfect number.");
        }
    }
}