package adv1_maths_gcd;

public class Pubg {
	public static void main(String[] args) {
		int[] A = {2,3,4};
		System.out.println(solve(A));
	}

	//TC = O(N* log (max(arr)))
	//SC = O(log max(arr))
	public static int solve(int[] A) {
		int n = A.length;
		//loop and find GCD of all elements
		int gcd_Val = 0;
		for(int i=0;i<n;i++) {
			gcd_Val = gcd(gcd_Val, A[i]);
		}
		return gcd_Val;
	}
	
	private static int gcd(int a, int b) {
		// base case
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
