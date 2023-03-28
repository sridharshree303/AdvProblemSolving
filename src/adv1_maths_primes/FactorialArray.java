package adv1_maths_primes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FactorialArray {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,3,2,3));
		System.out.println(solve(list));
	}

	public static int solve(ArrayList<Integer> A) {
		Collections.sort(A);
		// System.out.println(A);
		int n = A.size();
		int mod = 1000000007;
		int max = Collections.max(A);
		// check isPrime with the help of seive algorithm
		boolean[] isPrime = new boolean[max + 1];
		for (int i = 2; i * i <= max; i++) {
			if (!isPrime[i]) {
				for (int j = i * i; j <= max; j = j + i) {
					isPrime[j] = true;
				}
			}
		}
		// Find primenumberscount in Factorial of element
		// for each each prime number : count of values greater than this prime
		// and less than next prime (increase count till next prime exist)
		// eg: 13!, 14!, 15! 16! will have set of primes until it reaches next greater
		// prime
		// so sorting helpes here
		int[] isPrimeCount = new int[max + 1];
		for (int i = 2; i <= max; i++) {
			if (!isPrime[i]) {
				isPrimeCount[i] = isPrimeCount[i - 1] + 1;
			} else {
				isPrimeCount[i] = isPrimeCount[i - 1];
			}
		}
		int count = 1;
		if (A.get(0) < 2) {
			count = 0;
		}
		long sum = 0;
		for (int i = 0; i < n - 1; i++) {
			if (isPrimeCount[A.get(i)] == isPrimeCount[A.get(i + 1)]) {
				count++;
			} else {
				sum = (sum + (1 << count) - 1) % mod;
				count = 1;
			}
		}
		sum = (sum + (1 << count) - 1) % mod;
		return (int) sum;
	}
}
