package StringProblems;

import java.util.Scanner;

public class FindLengthOfString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		isLength(str);
		sc.close();
	}
	
	public static void isLength(String str) {
		int length=0;
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			length++;
		}
		System.out.println("Length of String is: "+length);
	}
}
