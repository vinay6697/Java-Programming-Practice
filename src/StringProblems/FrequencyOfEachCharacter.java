package StringProblems;

import java.util.Scanner;

public class FrequencyOfEachCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
//		isFrequency(str);
		isFrequencyCount(str);
		sc.close();
	}
	
	public static void isFrequency(String str)
	{
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]=Character.MIN_VALUE;
				}
			}
			if(ch[i]!=Character.MIN_VALUE)
				System.out.println(ch[i]+"--->"+count);
		}
	}
	
	public static void isFrequencyCount(String str)
	{
		int[] count=new int[128];
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			count[ch]++;
		}
		
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
				System.out.println(((char)(i))+"---->"+count[i]);
		}
	}
}
