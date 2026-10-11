package numberpattern;
/*
	1         
	1 0       
	1 0 1     
	1 0 1 0   
	1 0 1 0 1 
*/
import java.util.Scanner;

public class NumberPattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				{
					if (i>=j)
						System.out.print(j%2+" ");
					else
						System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
