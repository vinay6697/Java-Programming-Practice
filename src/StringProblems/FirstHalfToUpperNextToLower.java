package StringProblems;

import java.util.Scanner;

public class FirstHalfToUpperNextToLower {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String s=isConvertToLower(str);
		System.out.println(s);
		sc.close();
	}
	
	public static String isConvertToLower(String s)
	{
		s=s.toLowerCase()
		int size=s.length();
		if((size)%2!=0)
		{
			String s1=s.substring(0,s.length()/2+1);
			String s2=s.substring(s.length()/2+1);
			return s1.toUpperCase()+s2.toLowerCase();
		}
		else
		{
			String s1=s.substring(0,s.length()/2);
			String s2=s.substring(s.length()/2);
			return s1.toUpperCase()+s2.toLowerCase();
		}
		
	}
	
}
