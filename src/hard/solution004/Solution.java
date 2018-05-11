package hard.solution004;

public class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int i = 0;
		int j = 0;
		int median = 0;
		int medianIndex = 0;
		int medianPre = 0;
		int total = nums1.length + nums2.length;
		while (medianIndex < total / 2 + 1) {
			medianPre = median;
			boolean flag = false;
			if (i < nums1.length && j < nums2.length) {
				median = nums1[i] < nums2[j] ? nums1[i] : nums2[j];
				flag = nums1[i] > nums2[j];
			} else if (i < nums1.length) {
				median = nums1[i];
			} else if (j < nums2.length) {
				median = nums2[j];
				flag = true;
			}
			if (!flag) {
				medianIndex++;
				i++;
				if (medianIndex == total / 2 + 1)
					break;
			} else {
				medianIndex++;
				j++;
			}
		}
		return total % 2 == 0 ? (double) (medianPre + median) / 2 : (double) median;
	}

	public static void main(String[] args) {
		int[] a = { -1};
		int[] b = { -2};
		double findMedianSortedArrays = new Solution().findMedianSortedArrays(a, b);
		System.out.println(findMedianSortedArrays);
	}
}
