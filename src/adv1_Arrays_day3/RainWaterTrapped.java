package adv1_Arrays_day3;

import java.util.Arrays;

public class RainWaterTrapped {
	public static void main(String[] args) {
		int[] in = { 2, 1, 3, 2, 1, 2, 4, 3, 2, 1, 3, 1 };
		System.out.println(trap(in));
	}

	//Time complexity - O(n)
	//Space complexity - O(n)
	public static int trap(final int[] A) {
		int[] temp1 = A.clone();
		int[] temp2 = A.clone();
		// length
		int n = A.length;
		int ans = 0;

		// edge case
		if (n == 1) {
			return 0;
		}
		
		// find prefix and suffix max array
		System.out.println(Arrays.toString(A));
		int[] pf = pfm(temp1);
		System.out.println(Arrays.toString(pf));
		int[] sf = sfm(temp2);
		System.out.println(Arrays.toString(sf));

		// loop and check
		for (int i = 0; i < n; i++) {
			int aa = min(pf[i], sf[i]);
			ans += (aa-A[i]);
		}

		return ans;
	}

	private static int[] pfm(int[] B) {
		int ans[] = B;
		for(int i=1;i<ans.length;i++) {
			if(ans[i-1] > ans[i]) {
				ans[i] = ans[i-1];			
			}
		}
		return ans;
	}
	
	private static int[] sfm(int[] C) {
		int ans[] = C;
		for(int i=ans.length-1;i>0;i--) {
			if(ans[i] > ans[i-1]) {
				ans[i-1] = ans[i];			}
		}
		return ans;
	}

	private static int min(int a, int b) {
		if (a > b)
			return b;
		return a;
	}
}
