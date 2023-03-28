package adv1_Arrays;

import java.util.Arrays;

public class Beggars {
	public static void main(String[] args) {
		int A[][] = {{1, 2, 10},{2, 3, 20},{2, 5, 25}};
		int B[][] = {{1, 3, 10},{6, 9, 2},{3, 5, 3},{2, 8, 4},{6, 7, 5}};
		int [] ar = solve(10,B);
		System.out.println(Arrays.toString(ar));
	}

	//Time complexity - O(q+n)
	//Space complexity - O(1)
	public static int[] solve(int A, int[][] B) {
		 //new array with A size
		int ans[] = new int[A];
		int N = ans.length;
		
		int n = B.length;
		for(int i=0;i<n;i++) {
			int a = B[i][0];
			int b = B[i][1];
			int p = B[i][2];
			ans[a-1] = p+ans[a-1]; 
			
			if(b <= N-1) {
				ans[b] = -1*p + ans[b];
			}
		}
		
		//Prefix sum
		for(int i=1;i<N;i++) {
			ans[i] = ans[i-1]+ans[i];
		}
	
		return ans;
	}
}

//[10, 14, 17, 7, 7, 11, 11, 6, 2, 0]

