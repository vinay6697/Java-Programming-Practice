package arrayProblems;

import java.util.Scanner;

public class CountPairWithGivenSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] ar=ArrayOperations.readArray();
		System.out.println("Enter the sum");
		int sum=sc.nextInt();
		isCountPair(ar,sum);
		sc.close();
	}
	
	public static void isCountPair(int[] ar,int sum)
	{
		int value=0;
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				value=ar[i]+ar[j];
				if(sum==value)
					count++;
			}
		}
		System.out.println(count);
	}
}
