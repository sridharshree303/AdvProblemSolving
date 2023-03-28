package adv2_Searching;

public class Sorted_Insertion_Position {
	public static void main(String[] args) {
//		int [] a = {1,3,4,6,7,9,12}; int k = 6;
		int [] aa = {1,3,5,6,7 }; // 4
		int k = 4;
		System.out.println(searchInsert(aa, k));
	}
	
	//TC = O(log n)
	//SC = O(1)
	//Binary search approach
	public static int searchInsert(int[] A, int B) {
		int n = A.length;
		int low = 0;
		int high = n-1;
		
		while(low <= high) {
			int mid = low + (high-low)/2;
			
			//Edge cases
			if(mid == n-1 && B > A[mid]) return n;
			if(mid == 0 && B < A[mid] ) return 0;
			
			//Base condtion
			if(A[mid] == B) {
				return mid;
			}
			
			if(A[mid] < B && A[mid+1] > B) {
				return mid+1;
			}
			
			//Left and right
			if(A[mid] < B) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		
		return -1;
    }
}
