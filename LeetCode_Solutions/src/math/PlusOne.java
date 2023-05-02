package math;

import java.math.BigInteger;
import java.util.ArrayList;

public class PlusOne {
	public static int[] plusOne(int[] digits) {
		ArrayList<String> newdigits = new ArrayList<String>();
		ArrayList<Integer> enddigits = new ArrayList<Integer>();
		String k;
		String l = null;

		for (int i : digits) {
			String j = Long.toString(i);

			newdigits.add(j);

		} // for loop

		for (int i = 0; i < newdigits.size();) {
			k = newdigits.get(i);
			l = l + k;
			i = i + 1;
		}

		// new one
		l = l.replaceAll("null", "");

		// end one
		BigInteger sum;
		String input2 = "1";
		BigInteger p = new BigInteger(l);
		BigInteger n = new BigInteger(input2);
		sum = p.add(n);

		String number = String.valueOf(sum);
		for (int i = 0; i < number.length(); i++) {
			int o = Character.digit(number.charAt(i), 10);
			enddigits.add(o);

		}

		int newarr[] = new int[enddigits.size()];

		for (int i = 0; i < enddigits.size(); i++) {
			newarr[i] = enddigits.get(i);

		}
		return newarr;

	}
}
