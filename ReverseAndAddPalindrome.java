import java.util.Scanner;
public class ReverseAndAddPalindrome
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=scanner.nextInt();   
        int reverse=reverseNumber(number);
        int sum=number+reverse;
        while (!isPalindrome(sum))
        {
            reverse=reverseNumber(sum);
            sum=sum+reverse;
        }
        System.out.println("Palindrome obtained:"+sum);
    }
    public static int reverseNumber(int num)
    {
        int reverse=0;
        while (num!=0) 
        {
            int digit=num%10;
            reverse=reverse*10+digit; 
            num/=10;
        }
        return reverse;
    }
    public static boolean isPalindrome(int num)
    {
        return num==reverseNumber(num);
    }
}
