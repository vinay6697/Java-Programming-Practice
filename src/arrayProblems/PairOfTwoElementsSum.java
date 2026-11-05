package arrayProblems;

import java.util.Scanner;

public class PairOfTwoElementsSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = ArrayOperations.readArray();

		System.out.println("Enter the sum element");
		int sum = sc.nextInt();
		isPairOfSumElements(ar, sum);
		sc.close();

	}

	public static void isPairOfSumElements(int[] ar, int sum) {
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				int value = ar[i] + ar[j];
				if (value == sum) {
					num1 = ar[i];
					num2 = ar[j];
					break;
				}
			}
			if (num1 != 0 && num2 != 0)
				break;
		}
		if (num1 != 0 && num2 != 0)
			System.out.println("pair found: "+num1+" "+num2);
		else
			System.out.println("pair not found");
	}
}
