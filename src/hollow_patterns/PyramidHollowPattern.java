package hollow_patterns;
/*
	        *         
	      *   *       
	    *       *     
	  *           *   
	* * * * * * * * * 
*/
import java.util.Scanner;

public class PyramidHollowPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2 * n - 1; j++) {
				if (i+j == n+1 ||  j-i == n-1 || i==n)
					System.out.print("*"+" ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
