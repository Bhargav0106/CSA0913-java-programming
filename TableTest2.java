class Fifthtable implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" x 5 = "+i*5);
		}
	}
}
class Tenthtable implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" x 10 = "+i*10);
		}
	}
}
class TableTest2
{
	public static void main(String arg[])
	{
		Fifthtable f=new Fifthtable();
		Tenthtable t=new Tenthtable();
                Thread t1=new Thread(f);
                Thread t2=new Thread(t);
		t1.start();
		t2.start();
	}
} 