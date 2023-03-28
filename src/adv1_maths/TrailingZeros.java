package adv1_maths;

public class TrailingZeros {
	public static void main(String[] args) {
		int N =3691;
		solve(N);
	}
	
	//TC = O(log 5 N)
	//SC = O(1)
	public static void solve(int N) {
		int count = 0;
		
		while(N >= 5) {
			
			count += N/5;
			
			N =  N/5;
			System.out.println(N);
		}
		
		System.out.println(count);
	}
}
