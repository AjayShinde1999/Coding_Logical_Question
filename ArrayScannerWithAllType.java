package inputuser;

import java.util.Scanner;

public class ArrayScannerWithAllType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array");
		int size = sc.nextInt();
		int[] x = new int[size];
		int[] temp = new int[x.length];
		int j = 0;
		int temp1;
		for (int i = 0; i < x.length; i++) {
			System.out.println("Enter the UNSORTED Array Elements " + (i + 1));
			x[i] = sc.nextInt();

		}
		System.out.println("THE ARRAY ELEMENTS ARE ");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		System.out.println("The Sorted Array is ");
		for (int i = 0; i < x.length - 1; i++) {
			for (int k = 0; k < x.length - 1; k++) {
				if (x[k] > x[k + 1]) {
					temp1 = x[k];
					x[k] = x[k + 1];
					x[k + 1] = temp1;
				}
			}
		}
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		System.out.println("Duplicate Elements are Removed");

		for (int i = 0; i < x.length - 1; i++) {
			if (x[i] != x[i + 1]) {
				temp[j] = x[i];
				j++;
			}
		}
		temp[j] = x[x.length - 1];

		for (int i = 0; i < j + 1; i++) {
			System.out.print(temp[i] + " ");
		}
		sc.close();
	}
}