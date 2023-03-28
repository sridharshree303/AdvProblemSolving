package adv2_sorting2;

import java.util.Arrays;

public class KClosestPointsToOrigin {
	
	public static void main(String[] args) {
		int[][] ar = { { 1, 3 }, { 2, -2 }, { 2, 2 } };
		int B = 1;
		System.out.println(solve(ar, B));
	}

	//TC = O(n log n) + O(n) + O(n) ~ O(n log n)
    //SC = O(n)
    public static int[][] solve(int[][] A, int B) {
        //Lenght of A
        int n = A.length;
        
        //Array for finding Kth distance
        int[] distance = new int[n];
        
        //2D array for returning the ans
        int[][] ans = new int[B][2];
    
        //storing the distances in array
        //TC = O(n)
        for (int i = 0; i < n; i++) {
            int x = A[i][0], y = A[i][1];
            distance[i] = (x * x) + (y * y);
        }

        //Sort the array for finding the kth distance
        Arrays.sort(distance);

        // Find the B-th distance
        int distanceB = distance[B - 1];
        int k = 0;
        
        // Print all distances which are
        // smaller than B-th distance
        for (int i = 0; i < n; i++) {
            int x = A[i][0], y = A[i][1];
            int dist = (x * x) + (y * y);

            if (dist <= distanceB) {
                ans[k][0] = x;
                ans[k][1] = y;
                k++;
            }
        }
        return ans;
    }
}
