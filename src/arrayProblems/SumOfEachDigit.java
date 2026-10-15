package arrayProblems;

public class SumOfEachDigit {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		isSum(ar);
	}
	
	public static void isSum(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			int n=array[i];
			int sum=0;
			while(n>0)
			{
				int digit=n%10;
				sum=sum+digit;
				n=n/10;
			}
			System.out.println("Sum of "+array[i]+" is\t:"+sum);
		}
	}

}
