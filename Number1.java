class Fibo extends Thread
{
  public void run()
  {
    int a=0,b=1,c;
    System.out.println(a);
    System.out.println(b);
    for(int i=0;i<=10;i++)
    {
      c=a+b;
      System.out.println(c);
      a=b;
      b=c;
    }
  }
}
class Reverse extends Thread
{
  public void run()
  {
    for(int i=10;i>=1;i--) 
    {
      System.out.println(" "+i);
    }
  }
}
class Number1
{
  public static void main(String arg[])
  {
   Fibo f=new Fibo();
   Reverse r=new Reverse();
   f.start();
   r.start();
  }
}