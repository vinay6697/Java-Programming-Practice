package arrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class CountPairWithGivenSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] ar=ArrayOperations.readArray();
		System.out.println("Enter the sum");
		int sum=sc.nextInt();
		isCountPair(ar,sum);
		isCount(ar,sum);
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
	
	public static void isCount(int[] ar,int sum)
	{
		Arrays.sort(ar);
		int count=0;
		
		int i=0;
		int j=ar.length-1;
		
		while(i<j)
		{
			int value=ar[i]+ar[j];
			if(value==sum)
				count++;
			
			if(value>=sum)
				j--;
			else 
				i++;
		}
		System.out.println(count);
			
	}
}
