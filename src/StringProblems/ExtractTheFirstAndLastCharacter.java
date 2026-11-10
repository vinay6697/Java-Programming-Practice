package StringProblems;

import java.util.Scanner;

public class ExtractTheFirstAndLastCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		isExtract(str);
		sc.close();
	}
	
	public static void isExtract(String str)
	{
		char first=str.charAt(0);
		char last=str.charAt(str.length()-1);
		
		System.out.println("First character is: "+first);
		System.out.println("last character is: "+last);
	}

}
