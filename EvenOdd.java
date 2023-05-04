package inputuser;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any positive number");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("Even nmber");
		} else {
			System.out.println("its odd number");
		}
		sc.close();

	}

}
