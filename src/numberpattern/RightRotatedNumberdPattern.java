package numberpattern;
/*
	1         
	1 3       
	1 3 5     
	1 3 5 7   
	1 3 5 7 9 
	2 4 6 8 10 
	2 4 6 8   
	2 4 6     
	2 4       
	2         
*/
import java.util.Scanner;

public class RightRotatedNumberdPattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n =sc.nextInt();
		for(int i=1;i<=2*n;i++)
		{
			int a=0;
			for(int j=1;j<=n;j++)
			{
				if(i>=j && i+j<=(2*n)+1)
				{
					if(i<=n)
					{
						System.out.print((a+j)+" ");
						a++;
					}
					else {
						System.out.print(a+2+" ");
						a+=2;
					}
				}
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
/**
1 3       
1 3 5     
1 3 5 7   
1 3 5 7 9 
2 4 6 8 10 
2 4 6 8   
2 4 6     
2 4       
2  
**/




