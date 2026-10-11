package numberPrograms;

import java.util.Scanner;

public class TechNumber2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int first=n%100;
		int last=n/100;
		
		int sum=first+last;
		int number=sum*sum;
		if(number==n)
			System.out.println("It is a Tech Number");
		else
			System.out.println("It is not a Tech Number");
		sc.close();
	}

}
