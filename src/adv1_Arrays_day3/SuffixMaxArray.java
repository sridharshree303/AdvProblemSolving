package adv1_Arrays_day3;

import java.util.Arrays;

public class SuffixMaxArray {
	public static void main(String[] args) {
		int [] input = {-5,1,2,3,2};
		int [] output = sfm(input);
		System.out.println(Arrays.toString(output)); //[3, 3, 3, 3, 2]
	}
	//TC = O(n)
	//SC = O(n)
	public static int[] sfm(int[] A) {
		int n = A.length;
		int ans[] = A.clone();
		for(int i=n-1;i>0;i--) {
			
			if(ans[i] > ans[i-1]) {
				ans[i-1] = ans[i];
			}
		}
		return ans;
	}
}
