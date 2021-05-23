package practice;

public class Calculator {
	public int number;
	
	public Calculator(int x) {
		this.number = x; 
	}
	
	public void findFactorial() {
		int y = number;
		int x;
		int result = 1;
		
		for (x = 0; x < y; x++) 
		{
			result *= number;
			number -= 1;
		}
		System.out.println(result);
		
	}
	
	
	public static void main(String[] args) {
		Calculator value1 = new Calculator(5);
		
		value1.findFactorial();
		}
	
}
