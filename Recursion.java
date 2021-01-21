
public class Recursion {

	public static double power(double x, int n) {
		if(n == 0)
			return 1;
		else
			return x * power(x, n - 1);
	}
	
	public static int count(int d, int n) {
		n = Math.abs(n);
		
		if(n < 10)
			return d == n ? 1 : 0;
		
		int digit = n % 10;
		return digit == d ? 1 + count(d, n/10) : count(d, n/10);
		
	}
	
	public static int sumDigits(int n) {
		n = Math.abs(n);
		if(n == 0)
			return 0;
		
		return n % 10 + sumDigits(n / 10);
	}
	
	
	public static void main(String[] args) {
		System.out.println(power(2, 3));
		System.out.println(count(2, 50202020));
		System.out.println(sumDigits(50202020));
	}
	
	
	
}
