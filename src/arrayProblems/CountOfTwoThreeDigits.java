package arrayProblems;

public class CountOfTwoThreeDigits {
	public static void main(String[] args) {
		int[] ar = ArrayOperations.readArray();
		isCountDigits(ar);
	}

	public static void isCountDigits(int[] ar) {
		int twoDigitCount = 0;
		int threeDigitCount = 0;

		for (int i = 0; i < ar.length; i++) {
			int count = 0;
			int digit = ar[i];
			while (digit > 0) {
				count++;
				digit /= 10;
			}
			if (count == 2)
				twoDigitCount++;
			else if (count == 3)
				threeDigitCount++;
		}
		System.out.println("Two digits count is: " + twoDigitCount);
		System.out.println("Three digts count is: " + threeDigitCount);
	}
}
