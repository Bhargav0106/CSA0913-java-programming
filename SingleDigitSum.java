import java.util.Scanner;
public class SingleDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int result = getSingleDigitSum(num);
        System.out.println("Sum of digits (single digit): " + result);
        scanner.close();
    }
    public static int getSumOfDigits(int num) {
        int total = 0;
        while (num != 0) {
            total += num % 10;
            num /= 10;
        }
        return total;
    }
    public static int getSingleDigitSum(int num) {
        while (num > 9) {
            num = getSumOfDigits(num);
        }
        return num;
    }
}
