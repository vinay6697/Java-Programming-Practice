package numberPrograms;

import java.util.Scanner;

public class MToPowerN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the m value");
		int m = sc.nextInt();
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		int prod = 1;

		for (int i = 1; i <= n; i++) {
			prod = prod * m;
		}

		System.out.println(prod);
		sc.close();
	}
}
