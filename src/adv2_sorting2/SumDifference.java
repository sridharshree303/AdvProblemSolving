package adv2_sorting2;

import java.util.Arrays;

public class SumDifference {
	public static void main(String[] args) {
		int a[] = {3,5,10};
		System.out.println(solve(a));
	}
	
	//TC = O(n log n)
	//SC = O(1)
	public static int solve(int[] A) {
		int n = A.length;
		long mod = (long) Math.pow(10, 9)+7;
		
		//sort the array
		Arrays.sort(A);
		
		long max = 0L;
		long min = 0L;
		long pow = 1L;
		
		//loop and find the difference
		for(int i=0;i<n;i++) {
			max = (max + (A[i]*pow)%mod)%mod;
			min = (min + (A[n-i-1]*pow)%mod)%mod;
			pow = (pow*2)%mod;
		}
		return (int) ((int)(max-min+mod)%mod);
	}
}
