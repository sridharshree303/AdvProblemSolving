package adv2_Searching;

public class Find_The_First_Occurence_Of_Key {
	public static void main(String[] args) {
		int[] A = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3,
				3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6,
				6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8,
				8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
				10 };
		int K = 10;
		System.out.println(firstOccurence(A, K)); // 6 th index
		System.out.println(lastOccurence(A, K));
	}

	// TC = O(log n)
	// SC = O(1)
	// Finding first occurnce of a key in the sorted array
	public static int firstOccurence(int[] A, int K) {
		int ans = -1;
		int low = 0;
		int high = A.length;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (A[mid] == K) {
				ans = mid;
				high = mid - 1; // if mid-1 ==> results first occurence
			}
			if (A[mid] >= K) {
				high = mid - 1;
			} else if (A[mid] <= K) {
				low = mid + 1;
			}
		}

		return ans;
	}

	// TC = O(log n)
	// SC = O(1)
	// Finding first occurnce of a key in the sorted array
	// {1, 1, 1, 2, 2, 2, 5, 5, 5, 5, 7, 8}
	public static int lastOccurence(int[] A, int K) {
		int ans = -1;
		int low = 0;
		int high = A.length;

		while (low <= high ) {
			int mid = low + (high - low) / 2;
			
			//Base conditon overflow > n-1
			if(mid == A.length-1) {
				return mid;
			}
			
			if (A[mid] == K) {
				ans = mid;
				high = mid + 1; // if mid+1 ==> results last occurence
			}
			
			//left or right
			if (A[mid] > K) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return ans;
	}
}
