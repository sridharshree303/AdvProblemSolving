package adv2_Searching2;

import java.util.Arrays;
import java.util.List;

public class MedianOfArray {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(3);
		List<Integer> list2 = Arrays.asList(1,4);
		//1,3,4,7,8,10,11,13,16,17,18,19 ans = 10
		System.out.println(findMedianSortedArrays(list1, list2));
	}

	// approach 1
	// Use merge function and find the median
	// TC = O(n+m)
	// SC = O(n+m)

	// Approach 2
	// We should do it using extra space
	// TC = O(log(m+n))
	// SC = O(1)
	public static double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
		//Check the lowest list and re run
		//We should do binary search on small array because may big array include all values
		if(a.size() > b.size()) {
			return findMedianSortedArrays(b, a);
		}
		//while loop 
		//take l1,r1,l2,r2
		int n = a.size();
		int m = b.size();
		int low = 0;
		int high = n;
		
		while(low <= high) {
			int mid1 = (low+high)/2;
			int mid2 = ((n+m+1)/2)-mid1;
			
			double l1 = mid1 == 0 ? Integer.MIN_VALUE : a.get(mid1-1);
			double l2 = mid2 == 0 ? Integer.MIN_VALUE : b.get(mid2-1);
			double r1 = mid1 == n ? Integer.MAX_VALUE : a.get(mid1);
			double r2 = mid2 == n ? Integer.MAX_VALUE : b.get(mid2);
			
			if(l1 < r2 && l2 < r1) {
				if((n+m)%2 == 0) {
					return (Math.max(l1, l2)+Math.min(r1, r2))/2;
				}else {
					return Math.max(l1, l2);
				}
			}else if(l2 > r1) {
				low = mid1+1;
			}else if(l1 > r2) {
				high = mid1-1;
			}
		}
		
		return 0;
	}
}
