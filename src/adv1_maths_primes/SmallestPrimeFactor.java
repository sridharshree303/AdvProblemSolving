package adv1_maths_primes;

import java.util.Arrays;

public class SmallestPrimeFactor {
	public static void main(String[] args) {
		int A = 10;
		int ans[]  = spf(A);
		System.out.println(Arrays.toString(ans));
	}
	
	//TC = O(n log(log n)) ~ o(N)
	//SC = O(n)
	public static int[] spf(int A) {
		int [] arr = new int[A+1];
		//assign values
		for(int i=0;i<=A;i++) {
			arr[i] = i;
		}
		for(int i=2;i<=Math.sqrt(A);i++) {
			for(int j=i*i;j<=A;j+=i) {
				if(arr[j]>= i) {
					arr[j] = i;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
}
