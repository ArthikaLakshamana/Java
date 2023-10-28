package artt;

import java.util.Scanner;

public class fibonic {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int a=0;
	int b=1;
	int c;
	int i=1;
	System.out.print("enter the number: ");
	int number=input.nextInt();
	System.out.print(a+" "+b);
	do{
		c=a+b;
		a=b;
		b=c;
		i++;
		System.out.print(" "+c);
	}while(i<=number-2);// TODO Auto-generated method stub
	}

	}


