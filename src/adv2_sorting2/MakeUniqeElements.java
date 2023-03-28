package adv2_sorting2;

public class MakeUniqeElements {
	public static void main(String[] args) {
		int a[] = {1,1,4,1,3};
		System.out.println(solve(a));
	}
	
	//TC = O(n log n)
	//SC = O(1)
	public static int solve(int[] A) {
		
		//sort the array so that we can find duplicates easily
		QuickSort.quickSort(A, 0, A.length-1);
		
		int count = 0;
		for(int i=0;i<A.length-1;i++) {
			//if no duplicates
			if(A[i] < A[i+1])
				continue;
			else if(A[i] >= A[i+1]) {
				while(A[i+1] <= A[i]) {
					A[i+1]++;
					count++;
				}
			}
		}
		return count;
    }
}
