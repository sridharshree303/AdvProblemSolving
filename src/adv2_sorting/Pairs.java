package adv2_sorting;

import java.util.Arrays;

public class Pairs {
	public static void main(String[] args) {
		//count no of pairs
		//A[i] > B[j]
		int A[] = {7,3,5};
		int B[] = {2,0,6};
		System.out.println(countPairs(A, B));
	}
	
	//TC = O(n log n + m log m + n + m )
	//	 = O(n log n + m log m )
	//SC = O(n+m)
	public static int countPairs(int [] A, int B[]) {
		int count = 0;
		int n = A.length;
		int m = B.length;
		
		//Sort the arrays
		// TC = O(n log n + m log m)
		Arrays.sort(A);
		Arrays.sort(B);
		
		//loop and check condition 
		//TC = O(n+m)
		int i = 0;
		int j = 0;
		while(i < n && j < m ) {
			if(A[i]>B[j]) {
				count += (n-i);
				j++;
			}else {
				i++;
			}
		}
		
		return count;
	}
}
