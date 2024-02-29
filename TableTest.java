class Fifthtable extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" x 5 = "+i*5);
		}
	}
}
class Tenthtable extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" x 10 = "+i*10);
		}
	}
}
class TableTest
{
	public static void main(String arg[])
	{
		Fifthtable f=new Fifthtable();
		Tenthtable t=new Tenthtable();
		f.start();
		t.start();
	}
} 