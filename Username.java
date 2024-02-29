import java.util.*;
class Username
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the username");
  String str=sc.nextLine();
  System.out.println("enter the string");
  String str1=sc.nextLine();
  if(str.equals(str1))
  { 
    System.out.println("entered username is valid");
  }
  else
  {
    System.out.println("entered username is invalid");
  }
 }
}