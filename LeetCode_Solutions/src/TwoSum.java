//Question no 1

public class TwoSum {

	// test case
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 6, 8, 10, 11 };
		int target = 10;

		TwoSum s = new TwoSum();

		for (int g : s.twoSum(a, target)) {

			System.out.println("index :" + g);

		}
	}

	// main solution function
	public int[] twoSum(int[] nums, int target) {
		int[] a = nums;
		int targets = target;
		int j = 0;
		int k = 0;
		int l = 0;
		for (int i = 0; i < a.length;) {

			if (j > (a.length - 1)) {
				j = j - 1;
			}
			if (j == (a.length - 1)) {
				j = 0;
				l = l + 1;

			}
			if (l == j) {
				j = j + 1;
			}

			// main logic
			k = a[l] + a[j];
			if (k != targets) {
				j = j + 1;

			} else {
				i = a.length;
			}
		} // end for loop main

		int[] ToReturn = { l, j };

		return ToReturn;

	}
}
