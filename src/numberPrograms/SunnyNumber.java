package numberPrograms;

import java.util.Scanner;

public class SunnyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean flag=true;
		int m=n+1;
		for(int i=1;i<=m;i++)
		{
			if(i*i==m)
			{
				flag=false;
				break;
			}
		}
		if(flag==false)
			System.out.println("It is a Sunny number");
		else
			System.out.println("It is  not a Sunny number");
		sc.close();
	}
}
