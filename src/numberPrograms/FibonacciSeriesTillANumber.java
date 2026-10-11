package numberPrograms;

import java.util.Scanner;

public class FibonacciSeriesTillANumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<=n;i++)
		{
			 c=a+b;
			if(c<=n)
			{
				a=b;
				b=c;
				System.out.println(c);
			}
		}
		sc.close();
	}

}
