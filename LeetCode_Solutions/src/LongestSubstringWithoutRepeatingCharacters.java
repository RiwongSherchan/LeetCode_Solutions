//Question no 3

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	// test case
	public static void main(String[] args) {
		String s = "abcabcabc";
		System.out.println(lengthOfLongestSubstring(s));

	}

// main solution function
	public static int lengthOfLongestSubstring(String s) {
		int maxLength = 0;
		Set<Character> charSet = new HashSet<Character>();
		int left = 0;
		int right = 0;

		while (right < s.length()) {
			char c = s.charAt(right);
			

			// If the character is already in the set, remove characters from the left side
			// of the window
			while (charSet.contains(c)) {
				charSet.remove(s.charAt(left));
				System.out.println("left count:" + left);
				left++;
				
			}

			// Add the current character to the set and expand the window
			charSet.add(c);
			System.out.println("right count: " + right);
			right++;
			

			// Update the maximum length if necessary
			maxLength = Math.max(maxLength, right - left);
		}

		return maxLength;
	}

}
