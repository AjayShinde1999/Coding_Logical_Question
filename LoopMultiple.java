package inputuser;

import java.util.Scanner;

public class LoopMultiple {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		int i;
		for(i=1;i<=10; i++) {
			System.out.println(num + " X " +i+  " = "+i*num);
		}
	}
}
