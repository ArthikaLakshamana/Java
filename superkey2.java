package artt;

public class superkey2 {
	void eat()
	{
		System.out.println("eating..");
		
	}
}
class cat extends superkey2
{
	void eat()
	{
		System.out.println("eating..");
	}
	void bark()
	{
		System.out.println("barking..");
	}
	void work()
	{eat();
	super.eat();
	bark();
	}
	class testsuper2
	{
		public static void main(String args[])
		{
			cat c=new cat();
			c.work();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
