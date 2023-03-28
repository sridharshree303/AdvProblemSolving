package adv1_maths_gcd;

import java.util.Arrays;

public class AllGCDPair {
	public static void main(String[] args) {
		//int[] ar = {2, 2, 2, 2, 8, 2, 2, 2, 10};
		int[] ar1 = {1, 31, 1, 1, 1, 1, 14, 2, 1, 1, 1, 2, 22, 1, 11, 1, 1, 1, 1, 23, 1, 1, 11, 1, 11 };
		int ans[] = solve(ar1);
		System.out.println(Arrays.toString(ans));
	}
	
	//Time complexity = O(sqrt(A)*sqrt(A)) ~ O(n)
	//Space complexity = O(sqrt(A.length))
	public static int[] solve(int[] A) {
		
		//create a new array with sqrt of A size
        int n = (int) Math.sqrt(A.length);
        int[] ans = new int[n];
		
        //loop and find max value for every sqrt n length
        //return the array after storing the value
		for(int i=0;i<n;i++) {
			int temp = maxOfLen(A, n, i);
			ans[i] = temp;
		}
		
		return ans;
    }
	

	public static int maxOfLen(int[]A,int n,int i) {
		int max = Integer.MIN_VALUE;
		int limit = n*(i+1);
		for(int j=i*n;j<limit;j++) {
			if(max < A[j]) {
				max = A[j];
			}
		}
		
		return max;
	}
}
