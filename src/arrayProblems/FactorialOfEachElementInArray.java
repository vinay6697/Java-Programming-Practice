package arrayProblems;

import java.math.BigInteger;

public class FactorialOfEachElementInArray {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		
		//finding the factorial of the array
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("factorial of "+ar[i]+": "+isFactorial(ar[i]));
		}
		
	}
	
	public static BigInteger isFactorial(int n)
	{
		BigInteger fact=BigInteger.ONE;
		while(n>0)
		{
			fact=fact.multiply(BigInteger.valueOf(n));
			n=n-1;
		}
		return fact;
	}

}
