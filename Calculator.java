package practice;

public class Factorial {
	public int x;
	
	public Factorial(int x) {
		this.x = x; 
	}
	
	public void findFactorial() {
		int y = x;
		int result = 1;
		for (int z = 0; z < y; z++) 
		{
			result *= x;
			x -= 1;
		}
		System.out.println(result);
		
	}
	
	
	public static void main(String[] args) {
		int value = Integer.parseInt(args[0]);
		Factorial value1 = new Factorial(value);
		value1.findFactorial();
		}
}
