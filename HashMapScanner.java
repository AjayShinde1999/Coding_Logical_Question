package inputuser;

import java.util.*;

public class HashMapScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Map");
		int size = sc.nextInt();
		HashMap<String, Integer> x = new HashMap<>();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the Student Name " + (i + 1));
			String key = sc.next();
			System.out.println("Enter the RollNo. of " + key);
			int values = sc.nextInt();
			x.put(key, values);
		}
		sc.close();
		System.out.println("The Student Name and RollNo. are ");
		System.out.println(x);
		
		if(x.containsKey("AJAY")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		if(x.containsValue(6)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}