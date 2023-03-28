package adv1_strings;

public class CompareStringsLexograpically {
	public static void main(String[] args) {
		String str1 = "Sridhar";
		String str2 = "Chandhu";
		String str3 = "SridharKolluru";
		
		//System.out.println(str1.compareTo(str2)); //16
		//System.out.println(str2.compareTo(str3)); //-16
		//System.out.println(str1.compareTo(str3)); // 0
		
		//lexographically method
		System.out.println(lexographically(str1, str3));
		
	}
	
	//Time complexity = O(n)
	//Space complexity = O(1)
	public static int lexographically(String s1, String s2) {
		//if s1.length == s2.length comparing
		//returns if n-1 chars are different at any point
		for(int i=0;i<s1.length() && i<s2.length();i++) {
			if(s1.charAt(i) == s2.charAt(i)) {
				continue;
			}else {
				return s1.charAt(i)-s2.charAt(i);
			}
		}
		
		//return if s1.length > s2.length
		//size of the strings
		if(s1.length() > s2.length()) {
			return s1.length()-s2.length();
		}else if(s1.length() < s2.length()) {
			return s1.length()-s2.length();
		}else
			return 0; // returns if two strings are same
	}
}
