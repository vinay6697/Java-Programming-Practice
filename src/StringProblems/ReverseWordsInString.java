package StringProblems;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWordsInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
//		isReverse(str);
//		isReverseWords(str);
		reverseWordsUsingSplit(str);
		sc.close();
	}
	
	public static void isReverse(String str)
	{
		char[] ch=str.toCharArray();
		int j=ch.length-1;
		
		int f=0;
		int l=ch.length-1;
		String s="";
		
		while(j>=0)
		{
			if((j==ch.length-1 && ch[j]!=' ') ||(ch[j]!=' ' && ch[j+1]==' '))
			{
				l=j;
			}
			
			while(j>=0 && ch[j]!=' ') {
				j--;
			}
			
			f=j+1;
			while(f<=l)
			{
				s=s+ch[f];
				f++;
			}
			
			if(j>0)
				s=s+' ';
			
			j--;
		}
		System.out.println(s);
	}
	
	public static void isReverseWords(String str)
	{
		String[] s=str.split("\\s+");
		
		int start=0;
		int end=s.length-1;
		
		while(start<end)
		{
			String temp=s[start];
			s[start]=s[end];
			s[end]=temp;
			start++;
			end--;
		}
		
		String reversedWord="";
		for(int i=0;i<s.length;i++)
		{
			reversedWord+=s[i];
			if(i<s.length-1)
				reversedWord+=' ';
		}
		
		System.out.println(reversedWord);
	}
	
	public static void reverseWordsUsingSplit(String str)
	{
		String[] s=str.split("\\s+");
		int start=0;
		int end=s.length-1;
		
		while(start<end)
		{
			String s1=s[start];
			s[start]=s[end];
			s[end]=s1;
			
			start++;
			end--;
		}
		
		String finalString="";
		for(int i=0;i<s.length;i++)
		{
			finalString+=s[i];
			if(i<s.length-1)
				finalString+=' ';
		}
		
		System.out.println(finalString);
	}
}
