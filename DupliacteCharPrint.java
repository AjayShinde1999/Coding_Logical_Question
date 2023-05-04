package inputuser;

import java.util.LinkedHashSet;

public class DupliacteCharPrint {
	
	public static void main(String[] args) {
		char[] x = {'A','J','A','Y'};
		
		LinkedHashSet<Character> l = new LinkedHashSet<>();
		
		for(int i=0; i<x.length; i++) {
			for(int j=i+1; j<x.length; j++) {
				if(x[i]==x[j]) {
					l.add(x[i]);
				}
			}
		}
		System.out.println(l);
	}

}
