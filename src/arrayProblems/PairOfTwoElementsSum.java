package arrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class PairOfTwoElementsSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = ArrayOperations.readArray();

		System.out.println("Enter the sum element");
		int sum = sc.nextInt();
//		isPairOfSumElements(ar, sum);
		isPair(ar,sum);
		sc.close();

	}

	public static void isPairOfSumElements(int[] ar, int sum) {
		boolean flag=false;
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				int value = ar[i] + ar[j];
				if (value == sum) 
				{
					num1 = ar[i];
					num2 = ar[j];
					flag=true;
					break;
				}
			}
			if (flag)
				break;
		}
		if (flag)
			System.out.println("pair found: "+num1+" "+num2);
		else
			System.out.println("pair not found");
	}
	
	//solved using two pointer approach
	public static void isPair(int[] ar,int sum)
	{
		Arrays.sort(ar);
		int i=0;
		int j=ar.length-1;
		boolean flag=false;
		while(i<j)
		{
			int value=ar[i]+ar[j];
			if(value==sum)
			{
				System.out.println("pair found: "+ar[i]+" "+ar[j]);
				flag=true;
				break;
			}
			if(value>sum)
				j--;
			else
				i++;
		}
		if(!flag)
			System.out.println("pari not found");
	}
}
