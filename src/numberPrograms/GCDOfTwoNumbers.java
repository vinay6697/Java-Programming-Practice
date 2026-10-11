package numberPrograms;

import java.util.Scanner;

public class GCDOfTwoNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		int factor=0;
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
				factor=i;
		}
		System.out.println("Greatest Common Divisor is: "+factor);
		sc.close();
	}
}
