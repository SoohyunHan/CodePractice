package algorithm;

public class SmallerThanCurrentNum {

	public static void main(String[] args) {
		SmallerThanCurrentNum aa = new SmallerThanCurrentNum();
		int[] nums = { 8, 7, 3, 4, 1, 5, 1, 1 };
		for (int a : aa.smallerNumbersThanCurrent(nums)) {
			System.out.println(a);
		}
	}

	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (i != j && nums[i] > nums[j]) {
					count++;
				}
			}
			result[i] = count;
		}
		return result;
	}

}
