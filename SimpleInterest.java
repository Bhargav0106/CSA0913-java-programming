import java.util.*;
class SimpleInterest
{
  public static void main(String atg[])  
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter principal amount");
    int p=sc.nextInt();
    System.out.println("enter no of years");
    int n=sc.nextInt();
    System.out.println("enter rate of interest");
    int r=sc.nextInt();
    int SimpleInterest;
    SimpleInterest=(p*r*n)/100;
    System.out.println("SimpleInterest="+SimpleInterest);
  }
}