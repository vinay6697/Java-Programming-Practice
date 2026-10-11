package numberPrograms;

import java.util.Scanner;

public class DuckNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp=n;
		int d=1;
		int count=0;
		int count1=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		
		for(int i=1;i<count;i++)
			d=d*10;
		
		if(temp/d==0)
			System.out.println("not a duck number");
		else
		{
			while(temp!=0)
			{
				int digit=temp%10;
				if(digit==0)
					count1++;
				temp=temp/10;
			}
		}
		
		if(count1>=1)
			System.out.println("it is a duck number");
		else
			System.out.println("it is  not a duck number");
		sc.close();
	}
}
