package arrayProblems;

public class PrimeElements {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		isCheck(ar);
	}
	
	public static void isCheck(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(isPrime(ar[i]))
				System.out.println(ar[i]);
		}
	}
	
	public static boolean isPrime(int n)
	{
		if(n<=1)
			return false;
		else
		{
			for(int i=2;i<=n/i;i++)
			{
				if(n%i==0)
					return false;
			}
			return true;
		}
	}
}
