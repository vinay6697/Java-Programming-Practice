package numberPrograms;

import java.util.Scanner;

public class DisariumNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int temp = n;
		int temp1 = n;
		int count = 0;
		while (n != 0) {
			count++;
			n = n / 10;
		}
		int sum = 0;
		while (temp != 0) {
			int digit = temp % 10;
			sum = sum + isDisarium(digit, count);
			count--;
			temp = temp / 10;
		}
		if (sum == temp1)
			System.out.println("It is a disarium number");
		else
			System.out.println("NOt a disarium number");

		sc.close();
	}

	public static int isDisarium(int n, int count) {
		int fact = 1;
		for (int i = 0; i < count; i++) {
			fact = fact * n;
		}
		return fact;
	}
}
