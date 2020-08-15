package algorithm;

public class DecompressRunLengthEncodedList {

	public static void main(String args[]) {
		DecompressRunLengthEncodedList dd = new DecompressRunLengthEncodedList();
		int[] nums = { 3, 2, 3, 4, 2, 5 };
		for (int a : dd.decompressRLElist(nums)) {
			System.out.println(a);
		}
	}

	public int[] decompressRLElist(int[] nums) {
		int length = 0;
		int start = 0;
		for (int i = 0; i < nums.length / 2; i++) {
			length = length + nums[2 * i];
		}
		int[] result = new int[length];
		for (int i = 0; i < nums.length / 2; i++) {
			result = recursion(result, nums[2 * i], nums[2 * i + 1], start);
			start = start + nums[2 * i];
		}
		return result;
	}

	public int[] recursion(int[] result, int freq, int val, int start) {
		if (freq == 0) {
			return result;
		} else {
			result[start++] = val;
			recursion(result, --freq, val, start);
		}
		return result;
	}
}
