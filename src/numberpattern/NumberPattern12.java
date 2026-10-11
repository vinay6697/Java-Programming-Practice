package numberpattern;
/*
	1 2 3 4 5 4 3 2 1 
	  1 2 3 4 3 2 1   
	    1 2 3 2 1     
	      1 2 1       
	        1         
*/
import java.util.Scanner;

public class NumberPattern12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int a = 0;
			for (int j = 1; j <= 2 * n - 1; j++) {
				{
					if (i <= j && j + i <= 2 * n) {
						if (j <= n)
							System.out.print(++a + " ");
						else
							System.out.print(--a + " ");
					} else
						System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
