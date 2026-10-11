package numberPrograms;

import java.util.Scanner;

public class XylemPholemNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int last=n%10;
		n=n/10;
		int innerSum=0;
		while(n>9)
		{
			int digit=n%10;
			innerSum=innerSum+digit;
			n=n/10;
		}
		
		int outerSum=last+n;
		if(innerSum==outerSum)
			System.out.println("Xylem number");
		else
			System.out.println("phloem number");
		sc.close();
	}
}
