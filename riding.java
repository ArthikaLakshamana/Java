package artt;

public class riding {
	void run()
	{
		System.out.println("runing");
		
	}
}
class splender extends riding
{
	void run()
	{
		System.out.println("running safely with 60km");
	}
	
}
class testriding1
{
	public static void main(String[] args) {
	riding r=new splender();
	r.run();// TODO Auto-generated method stub

	}

}
