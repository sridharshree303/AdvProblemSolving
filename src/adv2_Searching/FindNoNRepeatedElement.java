package adv2_Searching;

//Given a sorted array where very element repeat twice and 
//Except one element. Find that number
public class FindNoNRepeatedElement {
	public static void main(String[] args) {
		int[] A = { 1, 1, 2, 2, 3, 3, 4, 4, 5 };
		System.out.println(uniqueElement(A));
	}

	// TC = O(log n)
	// SC = O(1)
	public static int uniqueElement(int[] A) {
		// Approach 1
		// XOR all the elements
		// TC = O(n) SC = O(1)

		// Approach 2
		//TC = O(log n)
		//SC = O(1)
		int n = A.length;
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			// edge cases
			if (mid == 0 || mid == n - 1) {
				return A[mid];
			}

			if (A[mid - 1] != A[mid] && A[mid + 1] != A[mid]) {
				return A[mid];
			}

			// left or right
			// Checks even and odd indexes
			if (mid % 2 == 0 && A[mid + 1] == A[mid]) {
				low = mid + 1;
			} else if (mid % 2 == 1 && A[mid - 1] == A[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}
		return -1;
	}
}
//how to check if the mid is correct or not
//If((A[mid-1] != K) && (A[mid+1] != K)) return mid;

//Edge cases
//If mid = 0, A[mid-1] is an error
//If mid = n-1; A[mid+1] is an error

//mid = 0 is possible
//  1) low == 0 and high == 0 ==>  ans = low or A[mid]
//  2) low == 0 and high == 1 ==>  ans = A[mid] or low

//mid = n-1;
//	1) low = n-1 and high == n-1;

//How we know how to move to left and right
// {1,1,2,2,3,4,4,6,6}
// Here we checking low side even and odd indexs
// if(mid % 2 == 1 && A[mid-1] != A[ind])
//	  low = mid +1 ;
// else if(mid % 2 == 0 && A[mid+1] == A[mid])
//    low = mid +1 ;
// else 
//	  high = mid-1;
