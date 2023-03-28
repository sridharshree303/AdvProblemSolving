package adv2_sorting;

import java.util.Arrays;

public class InsertiongSort {
	public static void main(String[] args) {
		int[]arr = {8,6,3,2,4,1};
		int ans[] = solve(arr);
		System.out.println(Arrays.toString(ans));
	}
	//TC = O(n*n)
	//SC = O(1)
	static int[] solve(int[] A){
		int n = A.length;
		for(int i=1;i<n;i++) {
			int key = A[i];
			int j = i-1;
			
			for(j = i-1;j>=0;j--) {
				if(A[j] > key) {
					A[j+1] = A[j];
				}else {
					break;
				}
			}
			A[j+1] = key;
		}
		return A;
	}
}
