package numberpattern;
/*
	1 2 3 4 5 4 3 2 1 
	  1 2 3 4 3 2 1   
	    1 2 3 2 1     
	      1 2 1       
	        1         
	      1 2 1       
	    1 2 3 2 1     
	  1 2 3 4 3 2 1   
	1 2 3 4 5 4 3 2 1 
*/
import java.util.Scanner;

public class HourGlassNumbered1and0 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=2*n-1;i++)
		{
			int a=1;
			for(int j=1;j<=2*n-1;j++)
			{
				if((i<=j && i+j<=2*n) || (i+j>=2*n && i>=j))
				{
					if(j<n)
						System.out.print(a++ +" ");
					else
						System.out.print(a-- +" ");
				}
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
