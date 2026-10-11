package numberPrograms;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=0;
		int temp=n;
		int temp1=n;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		int sum=0;
		while(temp!=0)
		{
			int fact=1;
			int digit=temp%10;
			for(int i=1;i<=count;i++)
			{
				fact=fact*digit;
			}
			temp=temp/10;
			sum=sum+fact;
		}
		if(temp1==sum)
			System.out.println("Armstrong number");
		else
			System.out.println("not an armstrong number");
		sc.close();
	}
}
