package algorithms;

import java.util.Arrays;

public class MergeSortP {
	public static void main(String[] args) {
		
		int[]A = {91,52,83,23,62,15};
		int n = A.length;
		mergeSort(A,0,n-1);
		
		System.out.println(Arrays.toString(A));
		
	}
	
	//recursive
	//TC = O(n log n)
	//SC = O(n)
	public static void mergeSort(int[] A, int p, int r) {
		//base condition
		if(p < r) {
  			
			int mid =(p+r)/2;

			//divide by left and right
			//left
			//System.out.println("left");
			mergeSort(A, p, mid);
			//right
			//System.out.println("right");
			mergeSort(A, mid+1, r);
			
			//combine 
			mergeArrays(A,p,mid,r);
			
		}
	}
	
	//TC = O(e-s)
	//TC = O(e-s)
	static void mergeArrays(int[] A,int s, int m, int e) {

		//System.out.println(s+"-"+m+"-"+e);
		
		int left[] = new int[m-s+1];
		int right[] = new int[e-m];
		
		//divide into arrays
		for(int i=s;i<=m;i++) {
			left[i-s] = A[i];
		}
		
		for(int j=m+1;j<=e;j++) {
			right[j-m-1] = A[j];
		}
		
		System.out.println(Arrays.toString(left)+"---"+Arrays.toString(right));
		
		int i = 0, j = 0, k = s;
		// merging the elements of both the ranges.
		while(i < left.length && j < right.length) {
			if(left[i]<= right[j]) {
				A[k++] = left[i++];
			}else {
				A[k++] = right[j++];
			}
		}
		
		
		// checking if any of the elements left.
		while(i < left.length) {
			A[k++] = left[i++];
		}
		
		while(j < right.length) {
			A[k++] = right[j++];
		}
		
		//System.out.println(Arrays.toString(A));
	}
}
