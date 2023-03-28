package adv2_sorting2;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = {10,3,8,15,6,12,2,18,7,15,14};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	//Recursive
	//TC = O(n log n) or O(n*n)
	//SC = O(log n) or O(n)
	public static void quickSort(int[] A, int S, int E) {
		//base case
		if(S == E || S > E) {
			return ;
		}
		//we can write if( S < E){main condition}
		//main condition
		int pos = rearrange2(A,S,E);
		quickSort(A, S, pos-1);
		quickSort(A, pos+1, E);
	}
	
	//TC = O(n)
	//SC = O(1)
	public static int rearrange2(int[] arr,int S,int E) {
		int l = S+1;
		int r = E;
		while(l <= r) {
			if(arr[l] <= arr[S])
				l++;
			else if(arr[r]>arr[S])
				r--;
			else
				swap(arr, l, r);
		}
		swap(arr,S,r);
		System.out.println(Arrays.toString(arr));
		return r;
	}
	
	public static void swap(int arr[],int x,int y ) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
}






