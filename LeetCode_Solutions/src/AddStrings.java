//Question no 415

import java.math.BigDecimal;

public class AddStrings {
	// test case
	public static void main(String[] args) {

		String c = addStrings("11", "44");
		System.out.println(c);
	}

	// main solution function
	public static String addStrings(String num1, String num2) {
		BigDecimal number1 = new BigDecimal(num1);
		BigDecimal number2 = new BigDecimal(num2);
		BigDecimal sum;
		sum = number1.add(number2);
		String result = sum.toString();
		return result;

	}
}
