package StringProblems;

import java.util.Scanner;

public class CountOfWordsPresentInSentence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int count=isCount(str);
		System.out.println(count);
		sc.close();
	}
	
	public static int isCount(String str)
	{
		char[] ch=str.toCharArray();
		int count=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if((i==0 && ch[i]!=' ') || (ch[i]!=' ' && ch[i-1]==' '))
				count++;
		}
		return count;
	}
}
