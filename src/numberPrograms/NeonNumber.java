package numberPrograms;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		isNeonNumber(n);
	}
	
	public static void isNeonNumber(int n )
	{
		int square=n*n;
		int sum=0;
		while(square>0)
		{
			int digit=square%10;
			sum+=digit;
			square/=10;
		}
		if(sum==n)
			System.out.println("It is a Neon Number");
		else
			System.out.println("It is not a Neon Number");
	}
}
