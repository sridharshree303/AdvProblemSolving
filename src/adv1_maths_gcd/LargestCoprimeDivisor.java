package adv1_maths_gcd;

public class LargestCoprimeDivisor extends GCD {
	
	public static void main(String[] args) {
		int A = 23;
		int B = 7;
		System.out.println(gcd(A, B));
		System.out.println(cpFact(A,B));
	}
	
	//TC = O(log*log(min(A,B)))
	//SC = O(log(min(A,B)))
	public static int cpFact(int A, int B) {
		while (gcd(A, B) != 1) {
            A = A/gcd(A, B);
            //System.out.println(A);
        }

        return A;
	}
}
