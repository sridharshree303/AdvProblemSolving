package adv2_sorting;

import java.util.Arrays;

public class FindKthSmallest {
	public static void main(String[] args) {
		int [] arr = {2,3,54,8,2,9};
		int B = 3;
		System.out.println(kthsmallest(arr, B));
	}
	
	//TC = O(B*n) or O(n*n)
	//SC = O(1)
	public static int kthsmallest(final int[] A, int B) {
        int n = A.length;
        for(int i=0;i<n-1;i++){  // replace n-1 with B if need untill B is enough
            int cur = A[i];
            int ind = i;
            for(int j=i+1;j<n;j++){
                if(A[j]<cur){
                    cur = A[j];
                    ind = j;
                }
            }
            //swap
            int temp = A[i];
            A[i] = cur;
            A[ind] = temp;
        }
        System.out.println(Arrays.toString(A));
        return A[B-1];
    }
}
