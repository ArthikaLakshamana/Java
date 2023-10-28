package artt;

public class mulinher {
	void eat()
	{
		System.out.println("eating...");
	}
}
class Dog extends mulinher
{
	void bark()
	{
		System.out.println("barking...");
	}
}
class  testabc
{
	public static void main(String[] args) {
    Dog b=new Dog();
    b.bark();
    b.eat();
  

	}

}




