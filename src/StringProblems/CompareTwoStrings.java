package StringProblems;

import java.util.Scanner;

public class CompareTwoStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		String str1 = sc.nextLine();
		System.out.println("Enter the second String");
		String str2 = sc.nextLine();
		isCompare(str1, str2);
		sc.close();
	}

	public static void isCompare(String str1, String str2) {

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		if (ch1.length != ch2.length)
			System.out.println("Strings are not equal");
		else {
			boolean flag = false;
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] != ch2[i]) {
					flag = true;
					System.out.println("Strings are not equal");
					break;
				}
			}
			if (!flag)
				System.out.println("Strings are equal");
		}
	}
}
