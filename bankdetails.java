package artt;

public class bankdetails {

	String name;
	int age;
	int conductno;
	int amountdeposit;
	bankdetails(String n,int a,int ph,int amt){
		name=n;
		age=a;
		conductno=ph;
		amountdeposit=amt;
		
	}
	void display()
	{
		System.out.println(name+" "+age+" "+conductno+" "+amountdeposit);
	}
	public static void main(String[] args) {
		bankdetails b1=new bankdetails("ami",23,563829,5000);
		bankdetails b2=new bankdetails("kat",43,343829,6500);
		bankdetails b3=new bankdetails("care",32,563829,7600);
		b1.display();
		b2.display();
		b3.display();
		// TODO Auto-generated method stub

	}

}
