package numberPrograms;

import java.util.Scanner;

public class TechNumber {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number");
			int n=sc.nextInt();
			int n1=n;
			int d=1;
			
			int count=0;// variable to find the count and store the value
			
			//finding the count of digits
			for(;n!=0;n=n/10)
				count++;
			
			for(int i=1;i<=count/2;i++)
				d=d*10;
			
			int last=n1%d;
			int first=n1/d;
			
			int sum=first+last;
			int value=sum*sum;
					
			if(value==n1)
				System.out.println("it is a tech number");
			else
				System.out.println("not a tech number");
			
		}
	}
}
