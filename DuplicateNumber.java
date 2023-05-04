package inputuser;

import java.util.LinkedHashSet;

public class DuplicateNumber {
	public static void main(String[] args) {
		int[] x = {10,10,20,20,20,30,40,50};
		
		LinkedHashSet<Integer> x1 = new LinkedHashSet<>();
		
		for(int i=0; i<x.length; i++) {
			x1.add(x[i]);
		}
		
		for (Integer integer : x1) {
			System.out.println(integer);
		}
	}

}
