package adv1_maths;

import java.util.Arrays;

public class CountPairs {
	public static void main(String[] args) {
		//int a[] = { 4, 7, 6, 5, 5, 3 };
		int a[] = { 24,42,16,8,7,3,6,17,23,35,20,26,28,34,21 };
		int m = 6;
		System.out.println(solve(a, m));
	}
	
	//TC = O(N+M)
	//SC = O(M)
	private static int solve(int[] A, int M) {
		
		// intialse an array with m size
		int[] arr = new int[M] ;
		//we can use hashmap also
		//HashMap<Integer, Integer> map = new HashMap<>();
		
		//store the mod values of elements as per index
		for(int i=0;i<A.length;i++) {
			int temp = A[i] % M;
			arr[temp]++;
		}
		
		System.out.println(Arrays.toString(arr));
		
		//calculate the count
		int ans = 0;
		//caluclate the first value
		if(arr[0] >= 2) {
			ans += (arr[0]*(arr[0]-1))/2;
		}
		
		//calcute the mid values
		int i=1;int j = M-1;
		while(i< j) {
			ans += (arr[i]*arr[j]);
			i++;j--;
		}
		
		//condition for missing calculations
		//the mid value M/2
		if(M%2 == 0 && arr[M/2] >= 2) {
			ans += (arr[M/2]*(arr[M/2]-1))/2;
		}
		
		return ans;
	}
}
