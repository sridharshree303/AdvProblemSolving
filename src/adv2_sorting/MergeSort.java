package adv2_sorting;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = {25,3,5,2,75,5,7,8};
		mergesort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	

	public static void mergesort(int a[], int l, int r) {

		if (l < r) {
			int mid = l + (r - l) / 2;  // O(1)

			// sorting the left half
			mergesort(a, l, mid);   // O(N/2)

			// sorting the right half
			mergesort(a, mid + 1, r); // O(N/2)

			// merging both the halves
			merge(a, l, mid, r);   // O(N)
		}
	}

	private static void merge(int[] a, int l, int mid, int r) {

		int a1[] = new int[mid - l + 1];
		int a2[] = new int[r - mid];

		//Dividing array into two parts
		for (int i = l; i <= mid; i++) {
			a1[i - l] = a[i];
		}

		for (int i = mid + 1; i <= r; i++) {
			a2[i - mid - 1] = a[i];
		}
		
		System.out.println(Arrays.toString(a1)+"---"+Arrays.toString(a2));

		int i = 0, j = 0, k = l;

		// merging the elements of both the ranges.
		while (i < a1.length && j < a2.length) {
			if (a1[i] <= a2[j])
				a[k++] = a1[i++];
			else
				a[k++] = a2[j++];
		}

		// checking if any of the elements left.
		while (i < a1.length)
			a[k++] = a1[i++];
		
		while (j < a2.length)
			a[k++] = a2[j++];
	}
}
