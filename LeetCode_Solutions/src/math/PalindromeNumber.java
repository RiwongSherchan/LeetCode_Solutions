package math;



public class PalindromeNumber {

	//testing
	public static void main(String[] args) {
		int x = 121;
		boolean s = isPalindrome(x);
		System.out.println(s);
	}
	
//main function
	public static boolean isPalindrome(int x) {
		String j = "";
		String number = String.valueOf(x);
		for (int i = number.length() - 1; i > -1; i--) {
			char o = number.charAt(i);
			String CharString = String.valueOf(o);

			j = j + CharString;

		}
	
		if (j.equals(number)) {
			return true;
		} else {
			return false;
		}

	}
}
