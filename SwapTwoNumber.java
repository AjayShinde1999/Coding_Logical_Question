package inputuser;

public class SwapTwoNumber {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		num1 = num1 + num2;//30
		num2 = num1 - num2;//30-20 = 10
		num1 = num1 - num2;//30-10 = 20
		
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
