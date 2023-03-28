package adv1_maths_primes;

public class InverseModulo {
	public static void main(String[] args) {
		int A = 6;
		int B = 23;

		int abs = solve(A, B);
		System.out.println(abs);
	}

	public static int solve(int A, int B) {
		int g = gcd(A, B);
		if (g != 1) {
			return 0;
		}
		// If A and B are relatively prime, then modulo
		// inverse is A^(B-2) mod B
		return power(A, B - 2, B);

	}

	// Function to return gcd of a and b
	public static int gcd(int A, int B) {
		if (A == 0) {
			return B;
		}
		return gcd(B % A, A);
	}

	public static int power(int X, int Y, int M) {
		if (Y == 0) {
			return 1;
		}
		System.out.println("a");
		int p = power(X, Y / 2, M) % M;
		p = (int) ((p * (long) p) % M);
		System.out.println("b");
		//if even or odd
		if (Y % 2 == 0)
			return p;
		else
			return (int) ((X * (long) p) % M);
	}
}
