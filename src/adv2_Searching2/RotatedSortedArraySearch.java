package adv2_Searching2;

public class RotatedSortedArraySearch {
	public static void main(String[] args) {
		int A[] = {23,34,45,54,68,3,5,7,9,12,13,16,18,21};
		int B = 21;
		System.out.println(search(A, B));
	}
	
	//TC = O(log n)
	//SC = O(1)
	public static int search(final int[] A, int B) {
		int k = findK(A);
		int n = A.length;
        int lastVal = A[n-1];
        int low ,high;
        
        //edge case
        if(n == 1){
            return 0;
        }
 
		if(B <= lastVal) {
			low = k;
			high = n-1;
		}else {
			low = 0;
			high = k-1;
		}
		
		while(low <= high) {
			int mid = low+(high-low)/2;
			if(A[mid] == B) {
				return mid;
			}
			
			if(A[mid] < B) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
        return -1;
    }
	
	//TC = O(log n)
	//SC = O(1)
	public static int findK(int[] A) {
		int n = A.length;
		int low = 0;
		int high = n-1;
		int val = A[high];
		
		while(low <= high) {
			int mid = low + (high-low)/2;
			//edge cases
			if(mid == 0 || mid == n-1) {
				return mid;
			}
			
			//base case
			if(A[mid-1]>A[mid] && A[mid] < A[mid+1]) {
				return mid;
			}
			//left or right
			if(A[mid] <= val) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return n-1;
	}
}
