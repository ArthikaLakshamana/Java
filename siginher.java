package artt;

public class siginher {
	void eat()
	{
		System.out.println("eating...");
	}
}
class dog extends siginher
{
	void bark()
	{
		System.out.println("barking...");
	}
}
class testinheritance
{
	public static void main(String[] args) {
    dog b=new dog();
    b.bark();
    b.eat();

	}

}
