import java.util.*;

class student
{	
	int id;
	String name;

	void setId(int Id)
	{
		id=Id;	
	}
	
	void setName(String Name)
	{
		name=Name;
	}

	int getId()
	{
		return id;
	}

	String getName()
	{
		return name;
	}
		
class hashmap2
{
	public static void main(String[] args)
	{
		HashMap<Integer,student>obj = new HashMap<Integer,student>();
		
		