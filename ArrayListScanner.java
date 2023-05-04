package inputuser;

import java.util.*;

public class ArrayListScanner{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of ArrayList");
		int size = sc.nextInt();
		ArrayList<Integer> x = new ArrayList<>();
	
		for(int i=0; i<size; i++) {
			System.out.println("Enter the values "+(i+1));
			int values = sc.nextInt();
			x.add(values);
		}
		sc.close();
		System.out.println("The Vaues are ");
		System.out.println(x);
	}
}