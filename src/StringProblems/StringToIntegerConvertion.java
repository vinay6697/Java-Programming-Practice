package StringProblems;

import java.util.Scanner;

public class StringToIntegerConvertion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		isConvert(str);
		sc.close();
	}
	
	public static void isConvert(String str)
	{
		char[] ch=str.toCharArray();
		int rev=0;
		for(int i:ch)
		{
			if(i>=48 && i<=57)
			{
				int digit=i-48;
				rev=rev*10+digit;
			}
		}
		System.out.println(rev);
	}

}
