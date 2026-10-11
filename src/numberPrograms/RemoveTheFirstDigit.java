package numberPrograms;

import java.util.Scanner;

public class RemoveTheFirstDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("before removing");
		System.out.println(n);

		int temp = n;
		int divisor = 1;

		while (temp >= 10) {
			temp /= 10;
			divisor *= 10;
		}

		System.out.println(n % divisor);
		sc.close();
	}
}
