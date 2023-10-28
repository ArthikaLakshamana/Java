package artt;

public class superkey {
	String color="black";
}
class dog extends superkey
{
	String color="white";

void printcolor()
{
	System.out.println(color);
	System.out.println(super.color);
}
}
class testsuper1 {
	

	public static void main(String[] args) {
	dog d=new dog();
	d.printcolor();// TODO Auto-generated method stub

	}

}
