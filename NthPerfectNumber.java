import java.util.Scanner;
public class NthPerfectNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number:");
        int m=scanner.nextInt();
        System.out.print("Enter the range (up to):");
        int n=scanner.nextInt();
        int count=0;
        for (int i=1;i<n;i++) {
            if (m%i==0) {
                count += i;
            }
        }
        if (count==m) {
            System.out.println(m+"is a perfect number.");
        } else {
            System.out.println(m+"is not a perfect number.");
        }
    }
}