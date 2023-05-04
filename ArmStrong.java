package inputuser;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int r,s=0;
		int c=num;

		while(num>0) {
			r = num%10;
			s=(r*r*r)+s;
			num = num/10;
		}
		if(c==s) {
			System.out.println("Arm");
		}else {
			System.out.println("No");
		}
		sc.close();
		
	}

}
