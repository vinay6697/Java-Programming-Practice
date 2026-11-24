package StringProblems;

import java.util.Scanner;

public class ReplaceACharacterWithGivenCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String  str=sc.nextLine();
		
		System.out.println("Enter the character to replace");
		char c1=sc.nextLine().charAt(0);
		
		System.out.println("Enter the character to replace with");
		char c2=sc.nextLine().charAt(0);
		
		isReplace(str,c1,c2);
		sc.close();
	}
	
	public static void isReplace(String s,char c1,char c2)
	{
		String s1=""+c1;
		if(s.contains(s1))
			s=s.replace(c1, c2);
		
		System.out.println(s);
	}
}
