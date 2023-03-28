package adv2_Searching;

public class Max_Height_Of_StairCase {
	public static void main(String[] args) {
		System.out.println(solve(92761));
		System.out.println(solve(92761));
	}
	
	//TC = O(log n)
	//SC = O(1)
	public static int solve2(int A) {
		
		int low = 0;
		int high = A;
		int ans = 0;
		
		while(low <= high) {
			int mid = low+(high-low)/2;
			long temp = (mid*(mid+1))/2;
			if(temp <= A){
				ans = mid;
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		return ans;
	}
	
	//TC = O(n)
	//SC = O(1)
	public static int solve(int A) {
		//base case
		if(A == 1) {
			return 1;
		}
		
		int ans = 0;
		for(int i=1;i<A;i++) {
			int temp = (i*(i+1))/2;
			if(temp > A) {
				break;
			}
			ans++;
		}
		return ans;
	}
}
