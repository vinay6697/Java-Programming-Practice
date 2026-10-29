package arrayProblems;

public class HighestSumofTwoNumbers {
	public static void main(String[] args) {
		int[] ar = ArrayOperations.readArray();
		isHighestSum(ar);
	}

	public static void isHighestSum(int[] ar) {
		if (ar == null || ar.length < 2)
			System.out.println("invalid array");
		else {
			int sum = 0;
			for (int i = 0; i < ar.length; i++) {

				for (int j = i + 1; j < ar.length; j++) {
					if ((ar[i] + ar[j]) > sum)
						sum = ar[i] + ar[j];
				}
			}
			System.out.println(sum);
		}
	}
}
