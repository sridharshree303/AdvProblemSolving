package adv1_maths;

// A%M = B%M 
// Count the number of possibilities 
// Where M > 1
public class CountMods {
	public static void main(String[] args) {
		int a = 16;
		int b = 4;
		System.out.println(solve(a,b));
	}
	
	// TC = O(sqrt n )
	// SC = O(1)
	private static int solve(int a, int b) {
		int n = a-b;
		int count = 0;
		
		for(int i=1; i < Math.sqrt(n);i++) {
			if(n % i == 0) {

				if(i == 1 || i == n / i) {
					count++;
				}else {
					count = count + 2;
				}
			}
		}
		
		return count;
	}
}
