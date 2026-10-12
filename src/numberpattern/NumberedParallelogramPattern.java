package numberpattern;

/*
	1 2 3     
	  4 5 6   
	    7 8 9 
 */ 
import java.util.Scanner;

public class NumberedParallelogramPattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		int value=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=2*n-1;j++)
			{
				if(j>=i && j-i<=n-1)
					System.out.print(value++ +" ");
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
