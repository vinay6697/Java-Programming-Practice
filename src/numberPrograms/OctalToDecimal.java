package numberPrograms;

import java.util.Scanner;

public class OctalToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int oct = 0;
		int sum = 0;
		int count = 0;
		while (n != 0) {
			int digit = n % 10;
			sum = oct + (digit * power(8, count));
			count++;
			n = n / 10;
		}
		System.out.println(sum);
		sc.close();
	}

	public static int power(int n, int count) {
		int prod = 1;
		for (int i = 1; i <= count; i++) {
			prod = prod * n;
		}
		return prod;
	}

}
