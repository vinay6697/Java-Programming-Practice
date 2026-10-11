package numberPrograms;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		while (n != 1 && n != 4) {
			int sum = 0;	
			while (n != 0) {
				int digit = n % 10;
				sum = sum + digit * digit;
				n = n / 10;
			}
			n = sum;
		}
		if (n == 1)
			System.out.println("It is a happy number");
		else
			System.out.println("It is not a happy number");
		sc.close();
	}
}
