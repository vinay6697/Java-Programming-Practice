package StringProblems;

import java.util.Scanner;

public class SummationOfTwoStrings {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String");
		String s1=sc.nextLine();
		System.out.println("Enter the second String");
		String s2=sc.nextLine();
		isSum(s1,s2);
		sc.close();
	}
	
	public static void isSum(String s1,String s2)
	{
		int a=0;
		int b=0;
		try {
				a=Integer.parseInt(s1);
				b=Integer.parseInt(s2);
				System.out.println("Sum of "+s1+" and "+s2+" is: "+(a+b));
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please enter valid numeric Strings");
		}
		
		
	}
}
