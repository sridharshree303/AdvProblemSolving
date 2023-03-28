package adv2_sorting2;

import java.util.Arrays;

public class CountSort {
	public static void main(String[] args) {
		int [] ar = {2,232,4,3,32,4,3,4,2,3,5,3,23,2,4,2,3,52};
		int ans[] = solve(ar);
		System.out.println(Arrays.toString(ans));
	}

	//TC = O(n + r)
	//SC = O(r)
	public static int[] solve(int[] A) {
		int n = A.length;

		int maxVal = Integer.MIN_VALUE;
		// find the max
		// TC = O(n)
		for (int i = 0; i < n; i++) {
			maxVal = (maxVal < A[i]) ? A[i] : maxVal;
		}

		// intialise the ans array
		int ans[] = new int[maxVal + 1];

		// count the frequency
		for (int i = 0; i < n; i++) {
			ans[A[i]]++;
		}

		// return the values
		int k = 0;
		for (int i = 0; i < ans.length; i++) {
			int count = ans[i];
			while (count > 0) {
				A[k++] = i;
				count--;
			}
		}

		return A;
	}
}
