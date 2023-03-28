package adv1_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XORpreifx {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,2,5,6);
		System.out.println(getOriginalArray(list));
		System.out.println(2^7^0^3);
		
	}
	
	public static List<Integer> getOriginalArray(List<Integer> prefix) {
		int n = prefix.size();
		List<Integer> list = new ArrayList<>();
		list.add(prefix.get(0));
		for(int i=1;i<n;i++) {
			int temp = prefix.get(i)^prefix.get(i-1);
			list.add(temp);
			
		}
		return list;
	}
}
