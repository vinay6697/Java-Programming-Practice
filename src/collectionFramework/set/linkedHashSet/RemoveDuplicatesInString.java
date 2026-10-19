package collectionFramework.set.linkedHashSet;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicatesInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();

		LinkedHashSet<Character> lhs = new LinkedHashSet<>();

		for (char ch : str.toCharArray()) {
			lhs.add(ch);
		}

		String s = "";
		for (char ch : lhs) {
			s = s + ch;
		}
		System.out.println(s);
		sc.close();
	}

}
