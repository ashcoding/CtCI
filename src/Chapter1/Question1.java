package Chapter1;

import java.util.Arrays;

public class Question1 {

	public Question1() {

	}

	// 1.1 Is Unique
	public void runCode1_1() {
		String a = "cates";
		String b = "doges";
		String c = "sneks";
		System.out.println(a + " is " + (isUnique(a) ? "unique" : "not unique"));
		System.out.println(b + " is " + (isUnique(b) ? "unique" : "not unique"));
		System.out.println(c + " is " + (isUnique(c) ? "unique" : "not unique"));
	}

	public boolean isUnique(String str) {
		// Total number of unique char in ASCII is 128
		// Therefore, if string is more than 128, it isn't unique
		if (str.length() > 128) {
			return false;
		}
		
		boolean[] charArray = new boolean[128];
		// Go through each char in the String
		for (int i = 0; i < str.length(); i++) {
			int charVal = str.charAt(i);
			// Char is found
			if (charArray[charVal]) {
				return false;
			}
			charArray[charVal] = true;	
		}
		return true;
	}
	
	// 1.2 Is Permutation
	public void runCode1_2() {
		String one = "god";
		String two = "dog";
		String three = "cate";
		
		System.out.println(one + " and " + two + (isPermutation(one,two)? " is Permutation" : " is Not"));
		System.out.println(three + " and " + two + (isPermutation(three,two)? " is Permutation" : " is Not"));
		
	}
	
	public boolean isPermutation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		
		char[] oneChars = str1.toCharArray();
		char[] twoChars = str2.toCharArray();
		Arrays.sort(oneChars);
		Arrays.sort(twoChars);
		String one = new String(oneChars);
		String two = new String(twoChars);
		if (one.equalsIgnoreCase(two)) {
			return true;
		}
		
		return false;
	}

}
