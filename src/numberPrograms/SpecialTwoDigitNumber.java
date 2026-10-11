package numberPrograms;

import java.util.Scanner;

public class SpecialTwoDigitNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();// 59,19
		int temp = n;
		int sum = 0;
		int prod = 1;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit;
			prod = prod * digit;
			n = n / 10;
		}
		if (sum + prod == temp)
			System.out.println("It is a special two digit number");
		else
			System.out.println("It is not a special two digit number");
		sc.close();
	}
}
