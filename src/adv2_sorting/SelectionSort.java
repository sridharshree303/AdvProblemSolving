package adv2_sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int [] arr = {4,2,4,5,3,1,8};
		int ans[] = solve(arr);
		System.out.println(Arrays.toString(ans)); //[1, 2, 3, 4, 4, 5, 8]
	}
	
	//TC = O(n*n)
	//SC = O(1)
	public static int[] solve(int [] A) {
		int n = A.length;
		for(int i=0; i<n-1; i++) {
			int ind = i;
			int key = A[i];
			for(int j=i+1;j<n;j++) {
				if(A[j]<key) {
					ind = j;
				}
			}
			//swap
			A[i] = A[ind];
			A[ind] = key;
		}
		
		return A;
	}
}
