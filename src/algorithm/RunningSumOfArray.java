package algorithm;

public class RunningSumOfArray {
	public static void main(String args[]) {
		RunningSumOfArray rs = new RunningSumOfArray();
		int[] nums = { 1, 2, 3, 4 };
		rs.runningSum(nums);
	}

	public int[] runningSum(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				result[i] = nums[i];
			} else {
				result[i] = result[i - 1] + nums[i];
			}
		}
		return result;
	}
}
