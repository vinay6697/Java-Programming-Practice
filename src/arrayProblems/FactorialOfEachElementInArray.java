package arrayProblems;

public class FactorialOfEachElementInArray {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		
		//finding the factorial of the array
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("factorial of "+ar[i]+": "+isFactorial(ar[i]));
		}
		
	}
	
	public static long isFactorial(int n)
	{
		long fact=1;
		while(n>0)
		{
			fact=fact*n;
			n=n-1;
		}
		return fact;
	}

}
