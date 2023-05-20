import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//Question no 3
public class LongestSubstringWithoutRepeatingCharacters {

	// test
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
				left++;
			}

			// Add the current character to the set and expand the window
			charSet.add(c);
			right++;

			// Update the maximum length if necessary
			maxLength = Math.max(maxLength, right - left);
		}

		return maxLength;
	}

}
