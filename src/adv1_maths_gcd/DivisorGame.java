package adv1_maths_gcd;

public class DivisorGame {
	public static void main(String[] args) {
		int A = 411753753;
		int B = 1876;
		int C = 7430;
		
		System.out.println(solve(A, B, C));
	}
	
	public static int solve(int A, int B, int C) {
		int lcm = (B * C) / GCD.gcd(B, C);
		
		return A/lcm;
    }
}
