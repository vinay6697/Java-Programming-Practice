package arrayProblems;

import java.util.Scanner;

public class LongestSubarrayWithSumK {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] ar=ArrayOperations.readArray();
		
		System.out.println("Enter the sum");
		int sum=sc.nextInt();
		
		longestSubArrayLength(ar,sum);
		sc.close();
	}
	
		
		public static void longestSubArrayLength(int[] ar, int sum)
		{
		    int lengths = 0;

		    for(int i = 0; i < ar.length; i++)
		    {
		        for(int j = i; j < ar.length; j++)
		        {
		            int rsum = 0;

		            for(int k = i; k <= j; k++)
		            {
		                rsum += ar[k];
		            }

		            if(rsum == sum)
		            {
		                lengths = Math.max(lengths, j - i + 1);
		            }
		        }
		    }

		    System.out.println(lengths);
		}

}
