package inputuser;

import java.util.LinkedHashSet;

public class DuplicateString {
	public static void main(String[] args) {
		
		String str = "Im going to to college to college";
		String[] s = str.split(" ");

		LinkedHashSet<String> x = new LinkedHashSet<String>();

		for (int i = 0; i < s.length; i++) {
			x.add(s[i]);
		}

		for (String string : x) {
			System.out.print(string + " ");
		}

	}
}