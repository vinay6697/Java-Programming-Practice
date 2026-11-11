package StringProblems;

import java.util.Scanner;

public class CountOfVowelsInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		isVowelCount(str);
		sc.close();
	}
	
	public static void isVowelCount(String str)
	{
		char[] ch=str.toLowerCase().toCharArray();
		
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			char c=ch[i];
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				count++;
		}
		
		System.out.println("count of vowels in String: "+count);
	}

}
