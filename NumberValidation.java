package inputuser;

import java.util.Scanner;

public class NumberValidation{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Mobile Number");
		String num = sc.next();
		String check = "[6-9][0-9]{9}";
		
		if(num.matches(check)) {
			System.out.println("Accepted");
		} else {
			System.out.println("Check the Number");
		}
		sc.close();
	}
}