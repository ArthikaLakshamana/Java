package artt;

public class parcon {
	int id;
	String name;
	parcon(int i,String n){
		id=i;
		name=n;
		
	}
  void display() {
	  System.out.println(id+" "+name);  
	  
  }
	public static void main(String[] args) {
		parcon p1=new parcon(111,"karan");
		parcon p2=new parcon(112,"aryan");// TODO Auto-generated method stub

	}

}
