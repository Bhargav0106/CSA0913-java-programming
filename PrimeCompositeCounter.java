import java.util.Scanner;
public class PrimeCompositeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();        
        int primeCount = 0;
        int compositeCount = 0;        
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (isPrime(number)) {
                primeCount++;
            } else {
                compositeCount++;
            }
        }
        System.out.println("Composite number: " + compositeCount);
        System.out.println("Prime number: " + primeCount);
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}