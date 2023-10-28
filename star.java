package artt;

import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = input.nextInt();
        System.out.println();

        for (int i = 1; i <= a; i++) {
            for (int j = a; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println("");


	}
	}
}
