import java.util.Scanner;
public class PatternPrinter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number to be printed:");
        int num=scanner.nextInt();
        System.out.print("Max Number of times printed:");
        int maxTimes=scanner.nextInt();
        printPattern(num,maxTimes);
        scanner.close();
    }
    public static void printPattern(int num, int maxTimes) {
        for (int i=1;i<=maxTimes;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print(num);
            }
            System.out.println();
        }
        for (int i=maxTimes-1;i>=1;i--) {
            for (int j=1;j<=i;j++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}