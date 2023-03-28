package adv1_Arrays;

// f(i,j) = | A[i] - A[j] | + | B[i] - B[j] | +  | i -j |;

public class MaxValueOfArray2 {
	public static void main(String[] args) {
		int a[] = {1,2,3};
		int b[] = {4,3,4};
		
		System.out.println(maxVal(a, b));
	}
	
	public static int maxVal(int []A,int []B) {
		int n = A.length;
		
		int result = Integer.MIN_VALUE;
		int max, min;
		int[] sign = {1,-1};
		
		for(int a =0;a<2;a++) {
			for(int b=0;b<2;b++) {
				int sum = 0;
				max = Integer.MIN_VALUE;
				min = Integer.MAX_VALUE;
				for(int i=0;i<n;i++) {
					sum = sign[a]*A[i] + sign[b]*B[i] + i;
					max = maxValue(max, sum);
					min = minValue(min, sum);
					
					result = maxValue(result, max-min);
				}
			}
		}
		
		return result;
	}

	public static int maxValue(int a, int b) {
		// TODO Auto-generated method stub
		if(a > b)
			return a;
		return b;
	}
	
	public static int minValue(int a, int b) {
		// TODO Auto-generated method stub
		if(a < b)
			return a;
		return b;
	}
}
