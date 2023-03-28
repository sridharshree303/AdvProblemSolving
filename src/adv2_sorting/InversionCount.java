package adv2_sorting;

import java.util.Arrays;

// count no of pairs
// I < j && A[i] > A[j]
public class InversionCount {
	public static void main(String[] args) {
		int A[] = {3, 4, 1, 2};
		int B[] = {10,3,8,15,6,12,2,18,7,1}; 
		System.out.println(solve(B));
		System.out.println(Arrays.toString(B));
	}
	
	//Approach 1
	//brute force approach 
	//TC = O(n^2)
	//SC = O(1)
	
	//Approach 2
	//Optimal
	//TC = O(n log n)
	//SC = O(n)
	public static int solve(int[] A) {
		int n = A.length-1;
		return invCount(A, 0, n);
    }
	
	public static int invCount(int[] A, int S , int E) {
		int mod = (int)Math.pow(10, 9)+7;
		
		//Edge case
		if(S == E) {
			return 0;
		}
		
		int mid = (S+E)/2;
		
		int x = invCount(A, S, mid)%mod;
		int y = invCount(A, mid+1, E)%mod;
		int z = merge(A,S,mid,E);
		
		return (x+y+z)%mod;
	}
	
	public static int merge(int[]A,int S, int M,int E) {
		int count = 0;
		int C[] = new int[E-S+1];
		int p1 = S;
		int p2 = M+1;
		int p3 = 0;
		
		while(p1 <= M && p2 <= E) {
			if(A[p1] <= A[p2]) {
				C[p3++] = A[p1++];
				//p1++;
			}else {
				C[p3++] = A[p2++];
				//p2++;
				count += (M-p1+1);
			}
		}
		
		while(p1 <= M) {
			C[p3++] = A[p1++];
		}
		
		while(p2 <= E) {
			C[p3++] = A[p2++];
		}
		
		p3 = 0;
		for(int i = S;i<=E;i++) {
			A[i] = C[p3++];
		}
		System.out.println(Arrays.toString(A));
		return count;
	}
}














