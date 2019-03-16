import java.util.*;

class priority_q
{
	public static void main(String[] args)
	{
		PriorityQueue<int>q = new PriorityQueue<int>();

		q.add(10);	
		q.add(20);
		q.add(30);
		q.add(5);
		q.add(6);

		Iterator itr = q.iterator();

		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
	}
}
		