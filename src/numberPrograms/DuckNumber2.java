package numberPrograms;

import java.util.Scanner;

public class DuckNumber2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=0;
		
		while(n!=0)
		{
			int digit=n%10;
			if(digit==0)
				count++;
			n=n/10;
		}
		if(count>=1)
			System.out.println("it is a duck number");
		else
			System.out.println("it is not a duck number");
		sc.close();
	}
}
