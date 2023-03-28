package adv2_sorting2;

import java.util.Arrays;

public class RearrangeArray {
	public static void main(String[] args) {
		int A[] = { 10, 3, 8, 15, 6, 12, 2,9, 18, 7, 15, 14 };
		int ans[] = reaarnage(A);
		System.out.println(Arrays.toString(ans));
		
	}

	// Approach 1
	// TC = O(n log n) -- using merge sort
	// SC = O(n)

	// Approach 2
	// TC = O(n)
	// SC = O(n)
	// Take a new array of N size and return it

	// Approach 3
	// TC = O(n)
	// SC = O(1)
	public static int[] reaarnage(int A[]) {
		int i = 1;
		int j = A.length - 1;

		while (i <= j) {
			if (A[0] > A[i])
				i++;
			else if (A[0] < A[j])
				j--;
			else
				swap(A, i, j);
		}

		swap(A, j, 0);

		return A;
	}

	// TC = O(1)
	// SC = O(1)
	protected static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
}
