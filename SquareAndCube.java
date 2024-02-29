import java.util.Scanner;
public class SquareAndCube {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=scanner.nextInt();
        int square=findSquare(number);
        int cube=findCube(number);
        System.out.println("Square of"+number+"is:"+square);
        System.out.println("Cube of"+number+"is:"+cube);
    }
    public static int findSquare(int number) {
        return number*number;
    }
    public static int findCube(int number) {
        return number*number*number;
    }
}
