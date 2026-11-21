package StringProblems;

import java.util.Scanner;

public class ReverseWordsInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		isReverse(str);
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
}
