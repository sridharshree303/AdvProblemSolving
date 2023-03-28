package adv2_sorting;

import java.util.Arrays;

public class WaveArray {
	public static void main(String[] args) {
		int[] aa = {4,9,9,3,6,5,7,10};  // 2,1,4,3,6,5,8,7,10,9
		int ans[] = wave(aa);
		System.out.println(Arrays.toString(ans));
	}
	
	public static int[] wave(int[] A) {
		int n = A.length;
		//egde case
		if(n == 1) {
			return A;
		}
		//Sort the array
		Arrays.sort(A);
		//swap the positons by looping +2
		for(int i=0; i<n; i+=2) {
			if(i+1 != n) {
				int temp = A[i+1];
				A[i+1] = A[i];
				A[i] = temp;
			}
		}
		return A;
	}
}
