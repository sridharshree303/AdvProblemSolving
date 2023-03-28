package adv2_Searching;

public class Find_A_Peak_Element {
	public static void main(String[] args) {
		int A[] = {1,100000000,100000000};
		System.out.println(solve(A));
	}
	
	//TC = O(log n)
	//SC = O(1)
	public static int solve(int[] A) {
        int n = A.length;
        int low = 0;
        int high = A.length-1;

        //edge case
        if ( n == 1){
            return A[0];
        }

        while(low <= high){
            int mid = (low+high)/2;
            //edge cases
            if(mid == 0){
                return Math.max(A[mid],A[mid+1]);
            }else if(mid == n-1){
                return A[mid];
            }else if(A[mid] >= A[mid-1] && A[mid] >= A[mid+1]){
                return A[mid];
            }
            //Left or right
            if(A[mid] < A[mid+1]){
                low = mid+1;
            }else if(A[mid] > A[mid+1]){
                high = mid-1;
            }
        }
        return -1;
    }
}
