package adv1_Arrays;

//f(i,j) = |A[i] - A[j]| + |B[i] - B[j]| + |C[i] - C[j]| + |D[i] - D[j]| + |i - j|
public class MaxValueOfArray3 extends MaxValueOfArray2 {
	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4 };
		int[] B = { -1, 4, 5, 6 };
		int[] C = { -10, 5, 3, -8 };
		int[] D = { -1, -9, -6, -10 };
		
		
		
		System.out.println(solve(A,B,C,D));

	}

	//TC = O(n)
	//SC = O(1)
	public static int solve(int[] A, int[] B, int[] C, int[] D) {
		int n = A.length;
		int sign[] = {1,-1};
		int result = Integer.MIN_VALUE;
		
		for(int a=0;a<2;a++) {
			for(int b=0;b<2;b++) {
				for(int c=0;c<2;c++) {
					for(int d=0;d<2;d++) {
						int sum = 0;
						int min = Integer.MAX_VALUE;
						int max = Integer.MIN_VALUE;
						
						for(int i=0;i<n;i++) {
							sum = sign[a]*A[i]+ sign[b]*B[i] + sign[c]*C[i] + sign[d]*D[i]+i;
							max = maxValue(max, sum);
							min = minValue(min, sum);
							
							result = maxValue(result, max-min);
						}
					}
				}
			}
		}
		return result;
	}
	
	
}
