package algorithm;

public class ShuffleTheArray {
	public static void main(String args[]) {
		ShuffleTheArray sta = new ShuffleTheArray();
		int n = 4;
		int[] nums = { 1, 4, 6, 8, 2, 6, 2, 7 };
		sta.shuffle(nums, n);
	}

	public int[] shuffle(int[] nums, int n) {
		int[] result = new int[2 * n];
		for (int i = 0; i < nums.length / 2; i++) {
			result[2 * i] = nums[i];
			result[2 * i + 1] = nums[nums.length / 2 + i];
		}

		return result;
	}
}
