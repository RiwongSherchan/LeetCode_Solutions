//Question no 4

import java.util.ArrayList;

public class MedianOfTwoSortedArrays {

	// test case
	public static void main(String[] args) {
		int[] nums1 = { 1, 3 };
		int[] nums2 = { 2 };
		double j = findMedianSortedArrays(nums1, nums2);
		System.out.println("result:" + j);
	}

	// main solution function
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		ArrayList<Integer> arr = new ArrayList<Integer>((nums1.length + nums2.length));
		int k = 0;
		int l = 0;
		int p = 0;
		double result = 0;
		for (int j : nums1) {
			arr.add(j);
			k = k + 1;
		}
		for (int z : nums2) {
			arr.add(z);
			k = k + 1;
		}
		// for odd number
		arr.sort(null);
		if (arr.size() % 2 != 0) {
			result = arr.size();
			result = result / 2;
			result = arr.get((int) result);
			return result;

			// then even number
		} else {
			k = arr.size();
			k = k / 2;
			l = arr.get(k);
			k = k - 1;
			p = arr.get(k);
			// re-use of same datatype variable
			result = p + l;
			result = result / 2;
			return result;
		}
	}

}// method end
