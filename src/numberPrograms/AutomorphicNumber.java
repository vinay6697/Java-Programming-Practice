package numberPrograms;

import java.util.Scanner;

public class AutomorphicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int square = n * n;
		boolean flag = false;
		while (n != 0) {
			if (n % 10 == square % 10) {
				n = n / 10;
				square = square / 10;
			} else {
				flag = true;
				break;
			}
		}
		if (flag == false)
			System.out.println("It is a automorphic number");
		else
			System.out.println("It is not a automorphic number");
		sc.close();
	}
}
