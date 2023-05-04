package inputuser;

public class RemoveWhiteSpace {
	public static void main(String[] args) {

		// Method 1

		String str = "Welcome to ch";

		String s = str.replaceAll(" ", "");
		System.out.println(s);

		// Method 2

		char[] c = str.toCharArray();
		String str2 = "";

		for (int i = 0; i < c.length; i++) {
			if (c[i] != ' ') {
				str2 = str2 + str.charAt(i);
			}
		}
		System.out.println(str2);

		// Method 3
		String str3 = "";
		for (int i = 0; i < c.length; i++) {
			if (c[i] != ' ') {
				str3 = str3 + c[i];
			}
		}
		System.out.println(str3);

	}

}
