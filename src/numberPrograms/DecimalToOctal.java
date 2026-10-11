package numberPrograms;

import java.util.Scanner;

public class DecimalToOctal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		String oct="";
		while(n!=0)
		{
			int rem=n%8;
			oct=rem+oct;
			n=n/8;
		}
		
		System.out.println(oct);
		sc.close();
	}

}
