package collectionFramework.set.linkedHashSet;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class DisplayUniqueWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the statement");
		String str = sc.nextLine();

		LinkedHashSet<String> lhs = new LinkedHashSet<String>();

		String[] s = str.split(" ");
		for (String s1 : s) {
			lhs.add(s1);
		}

		System.out.println("Orginal sentence");
		System.out.println(str);

		System.out.println("Unique words in insertion order:");
		System.out.println(lhs);
		sc.close();
	}
}
