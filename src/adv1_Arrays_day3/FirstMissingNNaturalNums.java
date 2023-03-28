package adv1_Arrays_day3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class FirstMissingNNaturalNums {
	public static void main(String[] args) {
		int ans[] = {4,2,6,7,1,5};
		System.out.println(firstMissingPositive(ans));
	}
	
	//TC = O(N)
	//SC = O(N)
	public static int firstMissingPositive(int[] A) {
		int n = A.length;
		
		//insert into hashset
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		// HashSet<Integer> hs = new HashSet<>();  //bit slow
		
		for(int i=0;i<n;i++) {
			hs.add(A[i]);
		}
		//System.out.println(hs);
		
		//loop and search for element
		for(int j=1;j<n+2;j++) {

			if(!hs.contains(j)) {
				return j;
			}
		}
		return n+1;
	}
}
