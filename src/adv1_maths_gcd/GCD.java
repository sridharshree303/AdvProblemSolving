package adv1_maths_gcd;

public class GCD {
	
	public static void main(String[] args) {
		System.out.println(gcd(30,12));
		
	}
	
	// Euclid's algorthim
	// TC = O(log max(a,b))
	// SC = O(log max(a,b))
	public static int gcd(int a, int b) {
		// base case
		if (b == 0) {
			return a;
		}
//		System.out.println(b+"--"+a%b);
		return gcd(b, a % b);
	}
}
