//Question no 29

public class DivideTwoInteger {

	// test case
	public static void main(String[] args) {
		int a = 100;
		int b = 14;
		System.out.println(divide(a, b));
	}

	// main solution function
	public static int divide(int dividend, int divisor) {
		Long divide1 = (long) dividend;
		Long divisor1 = (long) divisor;
		Long result = (divide1 / divisor1);

		if ((result > Integer.MAX_VALUE)) {
			result = result - 1;

		} else if (result < Integer.MIN_VALUE) {
			result = result + 1;
		}

		return Long.valueOf(result).intValue();
	}
}
