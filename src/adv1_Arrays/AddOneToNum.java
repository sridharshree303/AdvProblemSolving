package adv1_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class AddOneToNum {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,9,9));
		ArrayList<Integer> ans = plusOne(list);

		System.out.println(ans);
	}

	//TC = O(n)
	//SC = O(1)
	public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		int n = A.size();

		//iterate
		for (int i = n - 1; i >= 0; i--) {
			// if element is 9
			if(A.get(i) == 9) {
				A.set(i, 0);
				// if all 9 nines in the array from 0 to 9
				// make it 1 following zeros with adding one size
				if(i == 0) {
					A.add(0);
					A.set(0, 1);
					return A;
				}
			} // if not an 9, adds 1 to element and break the loop
			else {
				int val = A.get(i);
				A.set(i, (val+1));
				break;
			}
		}
		
		//if first letters are zeros then deletes the zeros 
		while(!A.isEmpty() && A.get(0) == 0 ) {
			A.remove(0);
		}

		return A;
	}
}
