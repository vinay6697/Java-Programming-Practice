package StringProblems;

import java.util.Scanner;

public class ConvertUppercaseCharacterToLowerCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		isConvertToLower(str);
		sc.close();
	}
	
	public static void isConvertToLower(String str)
	{
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
		}
		String s=new String(ch);
		System.out.println(s);
	}
}
