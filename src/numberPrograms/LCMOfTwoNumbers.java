package numberPrograms;

import java.util.Scanner;

public class LCMOfTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  m value");
		int m = sc.nextInt();
		System.out.println("Enter the n value");
		int n = sc.nextInt();

		int factor = 1;
		for (int i = 1; i <= m && i <= n; i++) {
			if (m % i == 0 && n % i == 0) {
				factor = i;
			}
		}

		int a = m * n / factor;
		System.out.println(a);
		sc.close();

	}

}
