package adv1_maths_gcd;

public class EnumeratingGCD {
	public static void main(String[] args) {
		String A = "1";
		String B = "3";
		System.out.println(solve(A,B));
	}

	
	public static String solve(String A, String B) {
		if(A.equals(B)) {
			return A;
		}
		return "1";
	}
}
