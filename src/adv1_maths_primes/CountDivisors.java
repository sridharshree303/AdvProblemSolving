package adv1_maths_primes;

import java.util.Arrays;

public class CountDivisors {
	public static void main(String[] args) {
		int[] aa = { 72, 24, 30 };
		int ans[] = solve1(aa);
		System.out.println(Arrays.toString(ans));
		
	}

	// Worst case
	// TC = O(n*sqrt(n))
	// SC = O(n) or O(1)
	public static int[] solve(int[] A) {
		for (int i = 0; i < A.length; i++) {
			A[i] = factors(A[i]);
		}

		return A;
	}

	static int factors(int A) {
		int count = 0;
		for (int i = 1; i <= Math.sqrt(A); i++) {
			if (A % i == 0) {
				if (i == A / i) {
					count++;
				} else {
					count = count + 2;
					;
				}
				System.out.println(i + "--" + count);
			}
		}

		return count;
	}
	
	//Optimal approach
	//TC = O(N log(log n) + q * log N) ~ O(N+q*log N)
	//SC = O(N)
	public static int[] solve1(int[] A) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<A.length;i++) {
			if(max < A[i]) {
				max = A[i];
			}
		}
		
		//calculate spf till n
		int smfArr[] = smf(max);
		
		//int count factors
		for(int i=0;i<A.length;i++) {
			A[i] = countFactors(A[i],smfArr);
		}
		return A;
	}
	
	//TC = O(log A)
	//SC = O(N)
	static int countFactors(int A,int smfArr[]) {
		//counters
		int countfact = 1;
		
		//calculate spf till n
		while(A > 1) {
			int factor = smfArr[A];
			int count = 0;
			
			while(A%factor == 0) {
			  count++;
			  A = A/factor;
			}
			
			countfact *= (count+1);
		}
		
		return countfact;
	}
	
	//TC = O(X log(log X))
	//SC = O(X)
	static int[] smf(int X) {
		
		//create and  intialise the array
		int[] spf = new int[X+1];
		for(int i=0;i<=X;i++) {
			spf[i] = i;
		}
		
		//Cal the smallest prime factor
		for(int i=2;i<=Math.sqrt(X);i++) {
			for(int j=i*i;j<=X;j+=i) {
				if(spf[j] > i) {
					spf[j] = i;
				}
			}
		}
		
		return spf;
	}
}


















