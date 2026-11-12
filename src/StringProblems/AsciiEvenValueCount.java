package StringProblems;

import java.util.Scanner;

public class AsciiEvenValueCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		isAsciiEvenCount(str);
		sc.close();
	}
	
	public static void isAsciiEvenCount(String str)
	{
		char[] ch=str.toCharArray();
		int count=0;
		
		for(int i:ch)
		{
			if(i%2==0 && i!=32)
				count++;
		}
		
		System.out.println(count);
	}
}
