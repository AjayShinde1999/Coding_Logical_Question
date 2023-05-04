package inputuser;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String str = sc.nextLine();
		Pattern p = Pattern.compile("[^a-zA-Z\\s]");
		Matcher m = p.matcher(str);
		int count = 0;
		while (m.find()) {
			count++;
		}

		if (count != 0) {
			System.out.println("INVALID NAME");
		} else {
			System.out.println("VALID NAME");
		}
		sc.close();
	}
}