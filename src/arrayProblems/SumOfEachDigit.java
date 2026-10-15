package arrayProblems;

public class SumOfEachDigit {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		isSumOfDigits(ar);
	}
	
	public static void isSumOfDigits(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			long n=Math.abs((long)array[i]);
			long sum=0;
			while(n>0)
			{
				long digit=n%10;
				sum=sum+digit;
				n=n/10;
			}
			System.out.println("Sum of "+array[i]+" is\t:"+sum);
		}
	}
}
