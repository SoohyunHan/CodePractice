package algorithm;

public class JewelsAndStones {

	public static void main(String[] args) {
		JewelsAndStones jas = new JewelsAndStones();
		System.out.println(jas.numJewelsInStones("aA", "aAAbbbbbb"));
	}

	public int numJewelsInStones(String J, String S) {
		int result = 0;
		char[] js = J.toCharArray();
		char[] ss = S.toCharArray();
		for (int i = 0; i < js.length; i++) {
			for (int j = 0; j < ss.length; j++) {
				if (js[i] == ss[j]) {
					result++;
				}
			}
		}

		return result;
	}

}
