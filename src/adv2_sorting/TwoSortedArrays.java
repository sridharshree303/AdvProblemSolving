package adv2_sorting;

import java.util.Arrays;

public class TwoSortedArrays {
	public static void main(String[] args) {
		int A[] =  {-4,-3,0};
		int B[] = {1,2};
		int[] ans = solve(A, B);
		System.out.println(Arrays.toString(ans));
	}
	
	//TC = O(n+m)
	//SC = O(n+m)
	public static int[] solve(final int[] A, final int[] B) { 
		int n = A.length;
		int m = B.length;
		int i= 0; int j =0;
		int p = 0;
		int[] arr = new int[n+m];
		while(i < n  && j < m) {
			if(A[i] <= B[j]) {
				arr[p++] = A[i++];
			}else {
				arr[p++] = B[j++];
			}
		}
		
		//add missing
		while(i<n) {
			arr[p++] = A[i++];
		}
		
		while(j<m) {
			arr[p++] = B[j++];
		}
		
        return arr;
    }
	
	
}
