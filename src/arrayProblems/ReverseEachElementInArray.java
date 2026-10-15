package arrayProblems;

public class ReverseEachElementInArray {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		isRevereEachElement(ar);
	}
	
	public static void isRevereEachElement(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			int n=array[i];
			int rev=0;
			while(n>0)
			{
				int digit=n%10;
				rev=rev*10+digit;
				n=n/10;
			}
			System.out.println("reverse of "+array[i]+" is\t:"+rev);
		}
	}
}
