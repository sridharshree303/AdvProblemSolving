package adv1_maths_gcd;

public class DeleteOne {
	public static void main(String[] args) {
		int[] arr= {12,15,18};
		System.out.println(solve(arr));
		//System.out.println(gcd(12,16));
	}
	
	//TC = O( N * log max(arr))
	//SC = O( N + log max(arr))
	public static int solve(int [] A) {
		int n = A.length;
		
		//suffix and Prefix
		int[] pf = new int[n];
		int[] sf = new int[n];
		int ans = 0;
		
		//calculate pf
		for(int i=0;i<n;i++) {
			ans = gcd(ans,A[i]);
			pf[i] = ans;
		}
		
		//calculate sf 
		ans = 0;
		for(int i=n-1;i>=0;i--) {
			ans = gcd(ans,A[i]);
			sf[i] = ans;
		}
		
		//System.out.println(Arrays.toString(pf));
		//System.out.println(Arrays.toString(sf));
		
		//main logic
		int res = Math.max(pf[n-2], sf[1]);
		
		for(int i=1;i<n-1;i++) {
			int curr = gcd(pf[i-1],sf[i+1]);
			res = Math.max(res, curr);
		}
		return res;
	}
	
	//Euclid's algorthim
	//TC = O(log max(a,b))
	//SC = O(log max(a,b))
	public static int gcd(int a,int b) {
		//base case
		if(b == 0) {
			return a;
		}
		return gcd(b,a%b);
	}
}
