package adv1_maths;

public class VeryLargePower {
	public static void main(String[] args) {
		int A = 2;
		int B = 27;
		System.out.println(solve(A, B));
	}
	
	//666348826
	
	public static int solve(int A, int B) {

		int mod = (int) Math.pow(10, 9) + 7;
		
		// caluculate the power factorial
		long power = 1;
		for (int i = 1; i <= B; i++) {
			power = i *( power%(mod-1));
		}
		
		power = power % (mod-1);
		
		int res = calculate(A, power, mod);
		return res %mod;
	}

	public static int calculate(long A, long B, long mod) {
		long ret = 1;
		while (B > 0) {
			// B power is /2
			if ((B & 1) == 1) {
				
				ret = (ret%mod * A) % mod;
			}

			// A is calculated by *2;
			A = (A * A) % mod;
			B = B >> 1;
		}
		return (int) (ret % mod);
	}
}
