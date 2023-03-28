package adv2_Searching;

public class BinarySearchAlgo {
	public static void main(String[] args) {
		int arr[] = {3,6,9,12,14,19,20,23,25,27};
		int key = 27;
		System.out.println(binarySearch1(arr, key));
		System.out.println(binarysearch2(arr, 0, arr.length, key));
	}
	
	//TC = O(log n)
	//SC = O(l)
	//Iteration approach
	public static int binarySearch1(int[] A, int key) {
		int n = A.length;
		int low = 0;
		int high = n-1;
		
		while(low <= high) {
			int mid = (low+high)/2;
			//base case
			if(A[mid] == key)
				return mid;
			
			if(key < A[mid]) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		
		return -1;
	}
	//Recursive approach
	//TC = O(log n)
	//SC = O(log n)
	public static int binarysearch2(int[] A,int low, int high,int key) {
		if(low <= high) {
			int mid = (low+high)/2;
			//base condition
			if(A[mid] == key) {
				return mid;
			}
			//main condition
			if(key < A[mid]) {
				high = mid-1;
			}else {
				low = mid+1;
			}
			return binarysearch2(A, low, high, key);
		}
		return -1;
	}
	
}
