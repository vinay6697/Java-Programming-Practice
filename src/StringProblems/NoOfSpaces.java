package StringProblems;

import java.util.Scanner;

public class NoOfSpaces {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		isSpaceCount(str);
		sc.close();
	}
	
	public static void isSpaceCount(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
				count++;
		}
		System.out.println("Count of spaces in String is: "+count);
	}
}
