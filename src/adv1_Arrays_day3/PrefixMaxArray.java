package adv1_Arrays_day3;

import java.util.Arrays;

public class PrefixMaxArray {
	public static void main(String[] args) {
		int [] input = {-5,1,2,3,2};
		int [] output = pfm(input);
		System.out.println(Arrays.toString(output));//[-5, 1, 2, 3, 3]
	}
	
	//Time complexity - O(N)
	//Space complexity - O(1) or O(N)
	public static int[] pfm(int[] A) {
		//initialise the array (optional)
		int n = A.length;
		int ans[] = A.clone();
		//loop
		for(int i=1;i<n;i++) {
			if(ans[i-1] > ans[i]) {
				ans[i] = ans[i-1];
			}
		}
		
		return ans;
	}
}
