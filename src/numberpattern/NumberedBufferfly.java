package numberpattern;
/*
	1               1 
	1 2           2 1 
	1 2 3       3 2 1 
	1 2 3 4   4 3 2 1 
	1 2 3 4 5 4 3 2 1 
	1 2 3 4   4 3 2 1 
	1 2 3       3 2 1 
	1 2           2 1 
	1               1 
*/
import java.util.Scanner;

public class NumberedBufferfly {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		int a=1;
		for(int i=1;i<=2*n-1;i++)
		{
				a=1;

			for(int j=1;j<=2*n-1;j++)
			{
				if((i>=j || i+j>=2*n) && (i<=j || i+j<=2*n))
				{
					if(j<n)
						System.out.print(a+++" ");
					else if(i==n && j==n)
					{
						System.out.print(a--+" ");
						a++;
					}
					else
					System.out.print(--a+" ");


				}
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
