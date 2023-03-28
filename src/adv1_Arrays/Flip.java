package adv1_Arrays;

import java.util.Arrays;

public class Flip {
	public static void main(String[] args) {
		String str = "010";
		System.out.println(Arrays.toString(flip(str)));
		System.out.println(countBit(str));
	}

	public static int[] flip(String A) {
		//intialize the array
		int ans[] = new int[2];
		int n = A.length();
		
		//edge case
		if(n == 1) {
			return new int[0];
		}
		
		int bits = A.length()-1;
		int a = 1;
		int b = 1;
		StringBuilder sb = new StringBuilder(A);
		//main logic
		for(int i=0;i<n;i++) {
			for(int j =i;j<n;j++) {
				
			}
		}
		
		return ans;
	}
	
	public static int checkBit(String A) {
		int ans = 0;
		for(int i=0;i<A.length();i++) {
			if(A.charAt(i)=='1') {
				ans++;
			}
		}
		return ans;
	}
	
	private static int countBit(String A) {
		int num = 0;
		int n = A.length()-1;
		
		// Binary string to DECIMAL
		for(int i=n;i>=0;i--) {
			if(A.charAt(i) == '1') {
				num += Math.pow(2, n-i);
			}
		}
		
		//Count bits
		int count = 0;
		while(num > 0) {
			int val = num%2 ;
			if(val == 1) {
				count++;
			}
			num = num >> 1;
			
		}
		return count;
	}
}
