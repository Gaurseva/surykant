
public class Gen<T> {

	T ob;
	Gen(T ob)
	{
		this.ob=ob;
	}
	
	public void show()
	{
		
		System.out.println("the type of ob is:"+ob.getClass().getName());
	}
	
	public T getOb()
	
	{
		
		return ob;
	}
}
