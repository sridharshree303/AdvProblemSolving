package adv1_maths;

import java.util.ArrayList;
import java.util.Arrays;

public class ReArrangeArray {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new  ArrayList<>(Arrays.asList(0,4,1,3,2));
		arrange(arr);
	}

	//0,2,1,3
	//0,8,4,12
	
	//new Ind -- 0,2,1,3
	//0/4+0 = 0
	//4/4+8 = 9
	//8/4+4 = 6
	//12/4+12 = 15
	// A = [0,9,6,15]
	
	//Time complexity - O(n)
	public static void arrange(ArrayList<Integer> A) {
		System.out.println(A);
		int n = A.size();
		//multiply the array values with size N
		for(int i=0;i<n;i++) {
			int val = n * A.get(i);
			A.set(i, val);
		}
		
		System.out.println(A);
		//assign the values by A[A[i]]
		for(int i=0;i<A.size();i++) {
			int newInd = A.get(i)/n;
			int newVal = A.get(newInd)/n + A.get(i);
			A.set(i, newVal);
		}
		
		System.out.println(A);
		// mod the elements
		for(int i=0;i<n;i++) {
			int val = A.get(i) % n;
			A.set(i, val);
		}
		
		A.forEach(a -> System.out.print(a+" "));
		
		//System.out.println(A);
	}

}

//ANS = {0,2,4,3,1}

//Input: arr[]  = {3, 2, 0, 1}
//Output: arr[] = {1, 0, 3, 2}
//Explanation: 
//In the given array 
//arr[arr[0]] is 1 so arr[0] in output array is 1
//arr[arr[1]] is 0 so arr[1] in output array is 0
//arr[arr[2]] is 3 so arr[2] in output array is 3
//arr[arr[3]] is 2 so arr[3] in output array is 2
