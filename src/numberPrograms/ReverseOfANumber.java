package numberPrograms;

import java.util.Scanner;

public class ReverseOfANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		boolean flag = false;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag == false)
			System.out.println("It is a prime number");
		else
			System.out.println("It is not a prime number");
		sc.close();
	}
}
