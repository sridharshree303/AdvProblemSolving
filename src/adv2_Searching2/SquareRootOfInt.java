package adv2_Searching2;

public class SquareRootOfInt {
	public static void main(String[] args) {
		int A = 214748364;
		System.out.println(sqrt(A));
		System.out.println(sqrt2(A));
	}
	
	//TC = O(Sqrt(n))
	//SC = O(1)
	public static int sqrt(int A) {
		int ans = 0;
		int i = 0;
		while(i <= A) {
			if(i*i <= A) {
				ans = i;
				i++;
				continue;
			}
			break;
		}
		return ans;
	}
	
	//Using binary Search
	//Search space 0 to N
	//TC = O(log n)
	//SC = O(1)
	public static int sqrt2(int A) {
		long low = 0;
		long high = A;
		
		while(low <= high) {
			long mid = low +(high-low)/2;
			//base case
			if(mid*mid <= A && (mid+1)*(mid+1) > A) {
				return (int)mid;
			}
			//left or right
			if(mid*mid > A){
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return 0;
	}
}
