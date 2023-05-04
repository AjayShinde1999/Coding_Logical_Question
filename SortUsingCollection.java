package inputuser;

import java.util.TreeSet;

public class SortUsingCollection {
	public static void main(String[] args) {
		int[] x = {10,20,32,1,2,3,4};
		
		TreeSet<Integer> x1 = new TreeSet<>();
		
		for(int i=0; i<x.length; i++) {
			x1.add(x[i]);
		}
		
		for (Integer integer : x1) {
			System.out.print(integer+" ");
		}
	}

}
