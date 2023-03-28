package adv2_sorting2;

import java.util.Arrays;

public class RearrangeSubArr {
	public static void main(String[] args) {
		int [] A = {10,3,8,15,6,12,2,18,7,15,14};
		int x = 2;
		int y  = 7;
		int ans[] = rearrangeSubarr(A,x,y);
		System.out.println(Arrays.toString(ans));
		//[10, 3, 6, 2, 8, 12, 15, 18, 7, 15, 14]
	}

	// Approach 1
	// TC = O(s+e)
	// SC = O(1)
	public static int[] rearrangeSubarr(int A[],int s,int e) {
		int i = s+1;
		int j = e;

		while (i <= j) {
			if (A[s] > A[i])
				i++;
			else if (A[s] < A[j])
				j--;
			else
				swap(A, i, j);
		}

		swap(A, j, s);

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
