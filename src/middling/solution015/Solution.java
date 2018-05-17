package middling.solution015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

	public List<List<Integer>> threeSum(int[] nums) {
		Set<String> only=new HashSet<>();
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						if(!only.contains(nums[i]+""+nums[j])) {
							List<Integer> list = new ArrayList<>();
							list.add(nums[i]);
							list.add(nums[j]);
							list.add(nums[k]);
							result.add(list);
							only.add(nums[i]+""+nums[j]);
							only.add(nums[j]+""+nums[i]);
							only.add(nums[i]+""+nums[k]);
							only.add(nums[j]+""+nums[k]);
							only.add(nums[k]+""+nums[i]);
							only.add(nums[k]+""+nums[j]);
						}
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { -1,0,1,2,-1,-4 };
		List<List<Integer>> threeSum = new Solution().threeSum(nums);
		System.out.println(threeSum.toString());
	}
}
