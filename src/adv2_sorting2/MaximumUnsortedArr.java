package adv2_sorting2;

import java.util.Arrays;

public class MaximumUnsortedArr {
	public static void main(String[] args) {
		int[] arr = {0,4,5,2,1,6,8};
		int ans [] = subUnsort(arr);
		System.out.println(Arrays.toString(ans));
		
		
		//secnd approach
		int ans2 [] = subUnsort2(arr);
		System.out.println(Arrays.toString(ans2));

	}
	public static int[] subUnsort(int[] arr) {
        int start_pos = -1;
        int end_pos = -1;
        int n = arr.length;

        //Find the first element from left which is greater than the next element
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                start_pos = i;
                break;
            }
        }

        if (start_pos == -1) {
            // Array is already sorted
            return new int[] {
                -1
            };
        }

        // Find the last element from right which is smaller than the previous element
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                end_pos = i;
                break;
            }
        }

        // Find the minimum and maximum element in the subarray A[start_pos...end_pos]
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = start_pos; i <= end_pos; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        // Find the correct position for the minimum and maximum elements
        int left_index = 0;
        while (left_index < start_pos && arr[left_index] <= min) {
            left_index++;
        }

        int right_index = n - 1;
        while (right_index > end_pos && arr[right_index] >= max) {
            right_index--;
        }

        return new int[] {
            left_index,
            right_index
        };
        
	}
	
	public static int[] subUnsort2(int [] A) {
		
		int [] sorted = A.clone();
		int n = A.length;
		
		//Sort the original array and sort 
		Arrays.sort(sorted);
		
		int i = 0;
		int left = -1;
		int right = -1;
		
		//compare the sorted and original arrays find the first and last indexs
		//start position
		while(i <= A.length-1) {
			if(A[i] != sorted[i]) {
				left = i;
				break;
			}
			i++;
		}
		
		//end position
		int j = n-1;
		while(j >= 0) {
			if(A[j] != sorted[j]) {
				right = j;
				break;
			}
			j--;
		}
		
		//edge case 
		if(left == -1 || right == -1) {
			return new int[] {-1};
		}
		
		return new int[] {left,right};
	}
}




