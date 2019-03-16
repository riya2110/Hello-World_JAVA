import java.lang.*;

class thread 
{
	public static void main(String[] args)
	{
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		t.setName("CU");
		System.out.println(t);
		System.out.println(t.getName());
		
		t.setPriority(8);
		System.out.println(t);
		System.out.println(t.getPriority());
	}
}