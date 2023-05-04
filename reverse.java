package inputuser;

import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		System.out.println("reverse no.is");
		int r;
		while (n > 0) {
			r = n % 10;
			System.out.print(r);
			n = n / 10;
		}
		sc.close();
	}
}
