package arrayProblems;

public class SumOfOddIndexElements {
	public static void main(String[] args) {
		int[] array=ArrayOperations.readArray();
		int sum=isOddIndexSum(array);
		System.out.println("sum of odd index elements is: "+sum);
	}
	
	public static int isOddIndexSum(int[] array)
	{
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			if(i%2!=0)
				sum+=array[i];
		}
		return sum;
	}

}
