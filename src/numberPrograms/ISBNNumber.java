package numberPrograms;

import java.util.Scanner;

public class ISBNNumber {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number");
			long n=sc.nextLong();
			long temp=n;
			long count=0;
			
			for(;temp!=0;temp=temp/10)
				count++;
			
			long sum=0;
			if(count==10)
			{
			for(long d=1;d<=count;d++)
			{
				long digit=n%10;
				sum=sum+(d*digit);
				n=n/10;
			}
			if(sum%11==0)
				System.out.println("ISBN number");
			else
				System.out.println("not an ISBN number");
			}
			else
				System.out.println("it is not a 10 digit number");
			
		}
	}
}
