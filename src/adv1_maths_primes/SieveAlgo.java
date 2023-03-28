package adv1_maths_primes;

import java.util.Arrays;

public class SieveAlgo {
	public static void main(String[] args) {
		int n = 49;
		int [] ans = primeRanges(n);
		System.out.println(Arrays.toString(ans));
	}
	
	//TC = O(n log(log n))
	//SC = O(N + n)
	public static int[] primeRanges(int A) {
		//intialise array with A+1 size
		boolean prime[] = new boolean[A+1];
		
		for(int i = 1;i<=A;i++) {
			prime[i] = true;
		}
		
		//make intial as false
		prime[0] = prime[1] = false;
		int count = 2;
		
		//System.out.println(Arrays.toString(prime));
		
		//loop and check all factors
		for(int i=2;i<=Math.sqrt(A);i++) {
			if(prime[i]) {
				for(int j=i*i;j<= A;j+=i) {
					if(prime[j]) {
						prime[j] = false;
						count++;
					}
					
				}
			}
		}
		
		int n = A-count+1;
		int aa[] = new int[n];
		int a = 0;
		//System.out.println(count);
		for(int i=2;i<=A;i++) {
			if(prime[i]) {
				aa[a++] = i;
			}
			
		}
		return aa;
	}
	
	//log(log n) take n = 10^6
	//log(log 2^20)
	//log 20 = 4  ~ O(n)
}
