package inputuser;

public class MaxNumber {
	public static void main(String[] args) {
		int[] x = { 10, 20, 5, 1, 200, 1000,500};
		int max = x[0];
		int min = x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
		}
		System.out.println("MAX NUMBER = "+max);
		System.out.println();
		for(int i=0; i<x.length; i++) {
			if(x[i]<min) {
				min=x[i];
			}
		}
		System.out.println("Min NUMBER = "+min);
	}
	
}
