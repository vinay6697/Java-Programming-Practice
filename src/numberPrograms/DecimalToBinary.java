package numberPrograms;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int n = sc.nextInt();
		String str = "";

		while (n > 0) {
			int digit = n % 2;
			str = str + digit;
			n = n / 2;
		}

		System.out.println(str);
		sc.close();
	}

}
