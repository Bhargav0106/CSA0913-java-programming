class Ninthtable extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" x 9 = "+i*9);
		}
	}
}
class Eleventhtable extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" x 11 = "+i*11);
		}
	}
}
class TableTest1
{
	public static void main(String arg[])
	{
		Ninthtable n=new Ninthtable();
		Eleventhtable e=new Eleventhtable();
		n.start();
		e.start();
	}
} 