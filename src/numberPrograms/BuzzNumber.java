package numberPrograms;

import java.util.Scanner;

public class BuzzNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		isBuzz(n);
		sc.close();
	}
	
	public static void isBuzz(int n)
	{
		if(n%10==7 || n%7==0)
			System.out.println("It is a Buzz Number");
		else
			System.out.println("It is not a Buzz Number");
	}
}
