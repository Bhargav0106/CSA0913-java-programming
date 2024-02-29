import java.util.Scanner;
public class NumberOfFactors {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number:");
        int givenNumber=scanner.nextInt();
        int count=0;
        for (int i=1;i<=givenNumber;i++) {
            if (givenNumber %i==0) {
                count++;
            }
        }
        System.out.println("Number of factors for "+ givenNumber +":"+ count);
    }

}