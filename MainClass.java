class X
{
    X()
    {
    }
    public X(int i)
    {
        System.out.println(1);
    }
}
 
class Y extends X
{
    public Y()
    {
        System.out.println(2);
    }
}

class MainClass
{
	public static void main(String[] args)
	{
		Y y=new Y();
	}
}
