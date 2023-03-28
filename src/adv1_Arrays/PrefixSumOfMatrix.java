package adv1_Arrays;

import java.util.Arrays;

public class PrefixSumOfMatrix {
	public static void main(String[] args) {
		int [][]  arr = {{1,2,3},{4,5,6},{7,8,9}};
		int ans[][] = prefixSumArr(arr);
		printPrefix(ans);
	}
	
	public static int[][] prefixSumArr(int[][] arr){
		int row = arr.length;
		int cols = arr[0].length;

		//row prefix
		for(int i=0;i<row;i++ ) {
			int sum = 0;
			for(int j=0;j<cols;j++) {
				sum += arr[i][j];
				arr[i][j] = sum;
			}

		}
		
		//printPrefix(arr);
		
		//cols prefix
		for(int i=0;i<cols;i++ ) {
			int sum = 0;
			for(int j=0;j<row;j++) {
				sum += arr[j][i];
				arr[j][i] = sum;
			}
		} 
		
		//printPrefix(arr);
		
		return arr;
	}
	
	public static void printPrefix(int[][] arr) {
		for(int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
	}
}
