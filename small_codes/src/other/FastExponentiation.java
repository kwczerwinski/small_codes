package other;

public class FastExponentiation {
	
	public static int exponentiation(int x, int n) {
		if(n == 0) return 1;
		else if(n == 1) return x;
		else if(n % 2 == 1) {
			int a = exponentiation(x, (n - 1)/2);
			return x*a*a;
		}
		else {
			int a = exponentiation(x, n/2);
			return a*a;
		}
	} //exponentiation
	
}