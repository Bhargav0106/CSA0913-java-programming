class PalindromeNumber extends Thread
{      
 public void run()
 {
   int num;
  while(num!=0)
  {
   int digit=num%10;
   int rev=rev*10+digit;
   num=num/10;
  }
  if(rev==num)
  {
   System.out.println("is a palindrome number");
  }
  else
  {
    System.out.println("is not a palindrome number");
  }
 }
}
class palindromeString extends Thread
{
  public void run()
  {
   int length=str.length();
   for(int i=0;i<length/2;i++)
   {  
    if(str.charAt(i)!=str.charAt(length-i))
    {
    System.out.println("string is a palindrome");
    }
     else
    {
    System.out.println("string is not a palindrome");
    }
   }
  }
}
class Palindrome
{
 public static void main(String arg[])
 {
   Number num=new Number();
   String str=new String();
   num.start();
   str.start();
 }
}