package algorithm;

public class NumOfStepsTillZero {
	public static void main(String args[]) {
		NumOfStepsTillZero num = new NumOfStepsTillZero();
		System.out.println(num.numberOfSteps(14));
	}

	public int numberOfSteps(int num) {
		int result = 0;
		while (true) {
			if (num == 0) return result;
            if (num % 2 == 0) {
				num = num / 2;
				result++;
			} else {
				--num;
				result++;
			}
		}
	}
}
