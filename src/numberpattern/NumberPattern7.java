package numberpattern;
/*
	        1         
	      0 0 0       
	    1 1 1 1 1     
	  0 0 0 0 0 0 0   
	1 1 1 1 1 1 1 1 1 
*/
import java.util.Scanner;

public class NumberPattern7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=2*n-1; j++) {
				{
					if ((i+j>=n+1 &&  j-i<=n-1))
						System.out.print(i%2+" ");
					else
						System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
