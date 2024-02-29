import java.util.Scanner;
class ReverseString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a string:");
        String inputString=scanner.nextLine();
        String reversedString=reverseString(inputString);
        System.out.println("Reversed string:"+ reversedString);
    }
    public static String reverseString(String inputString) {
        char[] charArray=inputString.toCharArray();
        int left=0;
        int right=charArray.length-1;
        while (left<right) {
            char temp=charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}
