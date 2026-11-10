package StringProblems;

import java.util.Arrays;
import java.util.Scanner;

public class StringToCharArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		isConvertToArray(str);
		sc.close();
	}

	public static void isConvertToArray(String str) {
		if (str.isBlank())
			System.out.println("String is empty");
		else {
			char[] ch = new char[str.length()];

			for (int i = 0; i < str.length(); i++) {
				ch[i] = str.charAt(i);
			}
			
			System.out.println(Arrays.toString(ch));
		}
	}
}
