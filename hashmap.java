import java.util.*;

class hashmap
{
	public static void main(String[] args)
	{
	
		HashMap<Integer,String>obj = new HashMap<Integer,String>();
			
		obj.put(1,"A");
		obj.put(2,"B");
		obj.put(3,"C");

		for(Map.Entry m : obj.entrySet())
		{	
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}

		Set s = obj.entrySet();
		Iterator it = s.iterator();
		
		while(it.hasNext())
		{
			Map.Entry m = (Map.Entry)it.next();
			
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}

	}
}