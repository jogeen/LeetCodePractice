package easy.solution1;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]+nums[j]==target) {
					result[0]=i;
					result[1]=j;
					break;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 12, 7, 11, 15,2 };
		int target = 9;
		int[] twoSum = new Solution().twoSum(nums, target);
		System.out.println(twoSum[0]+"+"+twoSum[1]);
	}
}
