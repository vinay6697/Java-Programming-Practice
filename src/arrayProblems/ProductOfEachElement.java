package arrayProblems;

public class ProductOfEachElement {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		isProductOfDigits(ar);
	}
	
	public static void isProductOfDigits(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			long n=Math.abs((long)array[i]);
			long prod=1;
			while(n>0)
			{
				long digit=n%10;
				prod=prod*digit;
				n=n/10;
			}
			System.out.println("Sum of "+array[i]+" is\t:"+prod);
		}
	}

}
