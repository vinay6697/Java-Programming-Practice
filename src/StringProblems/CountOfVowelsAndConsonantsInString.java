package StringProblems;

import java.util.Scanner;

public class CountOfVowelsAndConsonantsInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		isCountVowelsConsonants(str);
		sc.close();
	}

	public static void isCountVowelsConsonants(String str) {
		int vcount = 0;
		int ccount = 0;

		char[] ch = str.toLowerCase().toCharArray();

		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (c >= 'a' && c <= 'z') {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
					vcount++;
				else
					ccount++;
			} else
				continue;
		}
		System.out.println("vowels count is: " + vcount);
		System.out.println("consonants count is: " + ccount);
	}
}
