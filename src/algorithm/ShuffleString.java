package algorithm;

import java.util.HashMap;
import java.util.Map;

public class ShuffleString {
	public static void main(String[] args) {
		ShuffleString ss = new ShuffleString();
		int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
		System.out.println(ss.restoreString("codeleet", indices));
	}

	public String restoreString(String s, int[] indices) {
		char[] strings = s.toCharArray();
		Map<Integer, String> resultMap = new HashMap<>();
		String result = "";
		for (int i = 0; i < indices.length; i++) {
			resultMap.put(indices[i], Character.toString(strings[i]));
		}
		for (int i = 0; i < indices.length; i++) {
			result = result + resultMap.get(i);
		}
		return result;
	}
}
