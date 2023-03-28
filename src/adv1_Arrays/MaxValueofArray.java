package adv1_Arrays;

//f(i,j) = A[i] - A[j] 
public class MaxValueofArray {
	public static void main(String[] args) {
		int arr[] = {1,3,-2,4,-3};
		System.out.println(maxValue(arr));
	}
	
	//TC = O(n)
	//SC = O(1)
	public static int maxValue(int[] A) {
		//approach 1
		//Iterate and check the loop
		//TC = O(n^2)
		//SC = O(1)
		int max = 0;
		for(int i=0;i<A.length-1;i++) {
			for(int j = i+1;j<A.length;j++) {
				int temp = Math.abs(A[i]-A[j]);
				if(temp > max) {
					max = temp;
				}
			}
		}
		
		//approach 2
		//Find min and Max values
		//TC = O(n)
		//SC = O(1)
		int minVal = Integer.MAX_VALUE;
		int maxVal = Integer.MIN_VALUE;
		for(int i=0;i<A.length;i++) {
			if(A[i] < minVal) {
				minVal = A[i];
			}
			if(A[i] > maxVal) {
				maxVal = A[i];
			}
		}
		int ans = Math.abs(maxVal-minVal);
		return ans;
	}
	
	
}
