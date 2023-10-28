package artt;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = input.nextInt();
        
        for (int i = 1; i <= a; i++) {
            for (int j = a; j > i; j--) {
                System.out.print(" "); 
            }
            
            for (int k = 1; k <= i; k++) {
                System.out.print(k+" "); 
            }
            
            System.out.println();
					
		}
	}

	}


