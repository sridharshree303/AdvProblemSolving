package adv2_Searching;

//return the median element of the matrix

//Approach
//find the min and max elements in the matrix
//The range of the median should be between L to R

//The median of an matrix will be >= (M*N)/2 position
//if it is 3*3 matrix, then the median will be >=(9/2)+1

//find the count, number of values are less than the mid
//Use binary search and check on both sides ( lesser and greater)


public class MatrixMedian {
	public static void main(String[] args) {
		int aa[][] = { { 1, 3, 5 }, { 2, 6, 9 }, { 3, 6, 9 } };
		System.out.println(findMedian(aa));
	}

	// TC = O(k * n log m)
	// here k = log(m*n)
	// Overal TC = O(NlogM * log(M*N))
	// SC = O(1)
	public static int findMedian(int[][] A) {
		int l = 0, r = 0;
		int n = A.length, m = A[0].length;
		int mid, req = ((n * m) / 2) + 1;

		for (int i = 0; i < n; i++) {
			r = Math.max(r, A[i][m - 1]);
		}

		int ans = -1;

		while (l <= r) {
			mid = l + (r - l) / 2;
			int cnt = 0;

			for (int row[] : A) {
				int p = count(row, mid);
				cnt += p;
			}

			if (cnt >= req) {
				ans = mid;
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}

		return ans;
	}

	//TC = O(n log m) // n rows * log m
	//SC = O(1)
	public static int count(int a[], int x) {
		int low = 0;
		int high = a.length - 1;
		int ans = -1;

		while (low <= high) {
			int m = (low + high) / 2;
			if (a[m] > x) {
				ans = m;
				high = m - 1;
			} else {
				low = m + 1;
			}
		}

		if (ans == -1) {
			return a.length;
		}

		return ans;
	}
}
