package numberPrograms;

import java.util.Scanner;

public class CompositeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean result=isPrime(n);
		if(result==true)
			System.out.println("not a composite number");
		else 
			System.out.println("It is a composite number");
		sc.close();
	}
	
	public static boolean isPrime(int n) {
		boolean flag=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
}
