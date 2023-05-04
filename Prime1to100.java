package inputuser;
public class Prime1to100{
	public static void main(String[] args) {
		int i,j;
		
		for( i=1; i<=100; i++) {
			
			for(j=2; j<=i; j++) {
				if(i%j==0)
					break;
			}
			if(i==j) {
				System.out.print(j+" ");
			}
		}
	}
	
}