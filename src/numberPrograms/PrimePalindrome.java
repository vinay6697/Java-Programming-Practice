package numberPrograms;

import java.util.Scanner;

public class PrimePalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		int temp=n;
		int rev=0;
		for(;n!=0;n=n/10)
		{
			int digit=n%10;
			rev=rev*10+digit;
		}
		
		boolean flag=true;
		if(rev==temp)
		{
			for(int i=2;i<temp;i++)
			{
				if(temp%i==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
				System.out.println("prime palindrome number");
			else
				System.out.println("not a prime palindrome number");
		}
	}
}
