package numberPrograms;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sum=0;
		int count=0;
		while(n>0)
		{
			int digit= n%10;
			sum=sum+(digit*isPower(2,count));
			count++;
			n=n/10;
		}
		
		System.out.println(sum);
		sc.close();
}
	
	public static int isPower(int base,int ex)
	{
		int res=1;
		for(int i=1;i<=ex;i++)
		{
			res=res*base;
		}
		return res;
	}
}
