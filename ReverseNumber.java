import java.util.Scanner;
class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=scanner.nextInt();
        int reversedNumber = 0;
        for (int i=number;i!=0;i/=10) {
            int digit=i%10;
            reversedNumber=reversedNumber*10+digit;
        }
        System.out.println("Reverse of the number:"+ reversedNumber);
    }
}

