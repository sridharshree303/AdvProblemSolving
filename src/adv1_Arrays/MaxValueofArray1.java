package adv1_Arrays;

//Case 2 -> f(i,j) = |A[i] - A[j]| + |i-j|
public class MaxValueofArray1 {
	public static void main(String[] args) {
		int arr[] = {1,3,-1};
		System.out.println(maxValue1(arr));
		System.out.println(maxValue2(arr));
	}
	
	//Time complexity = O(n)
	//Space complexity = O(1)
	public static int maxValue2(int [] A){
		
		int sum = 0;
		int n = A.length;
		int max ;
		int min ;
		
		int ans = Integer.MIN_VALUE;
		int a[] = {1,-1};
		//finding the min and max
		for(int i =0;i<2;i++) {
			sum = 0;
			max = Integer.MIN_VALUE;
			min = Integer.MAX_VALUE;
			//inner
			for(int j=0;j<n;j++) {
				sum = a[i]*A[j]+j;
				max = maxValue(sum, max);
				min = minValue(sum,min);
				
				ans = maxValue(ans,max-min);
			}
		}
		return ans;
	}
	
	//TC = O(n)
	//SC = O(1)
	public static int maxValue1(int[] A) {
		int Xmax = Integer.MIN_VALUE , Ymax = Integer.MIN_VALUE;
		int Xmin = Integer.MAX_VALUE , Ymin = Integer.MAX_VALUE;
		
		
		//loop
		for(int i=0;i<A.length;i++) {
			int Xr = A[i]+i;
			Xmax = maxValue(Xmax, Xr);
			Xmin = minValue(Xmin, Xr);
			int Yr = A[i]-i;
			Ymax = maxValue(Ymax, Yr);
			Ymin = minValue(Ymin, Yr);
		}
		
		//System.out.println(Xmax+"--"+Xmin);
		//System.out.println(Ymax+"--"+Ymin);
		int ans = maxValue(Xmax-Xmin, Ymax-Ymin);
		
		return ans;
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
