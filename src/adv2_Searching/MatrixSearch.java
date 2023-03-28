package adv2_Searching;


//A matrix of N x M size with A inetgers
//write an algorithm that searches the integer the B in matrix A;
//Integer in each row are sorted from left to right
//The first integer of each row is greater than or equal to the last integer of the previous row.
//return 1 if B is present in A else return 0;

public class MatrixSearch {
	public static void main(String[] args) {
		int A[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,50}}; 
		System.out.println(searchMatrix(A, 3));
	}
	
	//TC = O(log n)
	//SC = O(1)
	public static int searchMatrix(int[][] A, int B) {
		int m = A.length;
		int n = A[0].length;
		int low = 0;
		int high = (m*n) -1;
		
		while(low <= high) {
			int mid = low + (high - low)/2;
			int i = mid/n ;
			int j = mid%n;
			
			if(A[i][j] == B) {
				//System.out.println(i+"--"+j);
				return 1;
			}
			
			if(B > A[i][j]) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		return 0;
    }
}
