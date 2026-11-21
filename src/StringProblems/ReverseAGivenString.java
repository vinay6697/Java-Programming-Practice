package StringProblems;

import java.util.Scanner;

public class ReverseAGivenString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String result=reverse(str);
		System.out.println("Revese of "+str+" is: "+result);
		sc.close();
	}
	
	public static String isReverse(String str)
	{
		char[] ch=str.toCharArray();
		int start=0;
		int end=ch.length-1;
		
		while(start<end)
		{
			char temp=ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			
			start++;
			end--;
		}
		return new String(ch);
	}
	
	//another way using StringBuffer
	public static String reverse(String str)
	{
		return new StringBuffer(str).reverse().toString();
	}
}
