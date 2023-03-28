package adv1_maths;

public class PairSumDivisibleByM {
	public static void main(String[] args) {
		int A[] = { 1, 2, 3, 4, 5 };
		int B = 2;
		System.out.println(solve(A, B));
	}

	// TC = O(N+M)
	// SC = O(M)
	private static int solve(int[] A, int M) {
		int mod = (int) Math.pow(10, 9) + 7;

		// intialse an array with m size
		int[] arr = new int[M];
		// we can use hashmap also
		// HashMap<Integer, Integer> map = new HashMap<>();

		// store the mod values of elements as per index
		for (int i = 0; i < A.length; i++) {
			int temp = A[i] % M;
			arr[temp]++;
		}

		// System.out.println(Arrays.toString(arr));

		// calculate the count
		long ans = 0;

		// caluclate the first value
		if (arr[0] >= 2) {
			long t1 = arr[0];
			long temp = (t1 * (t1 - 1)) / 2;
			ans += temp;
		}

		// the mid value M/2
		if (M % 2 == 0 ) {
			long t2 = arr[M / 2];
			long temp1 = (t2 * (t2 - 1)) / 2;
			ans += temp1;
		}

		// calcute the mid values
		int i = 1;
		int j = M - 1;
		while (i < j) {
			ans = (ans + (arr[i] * arr[j]));
			i++;
			j--;
		}

		return (int) ans % mod;
	}

}
