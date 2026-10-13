package arrayProblems;

public class SumOfEvenIndexElements {
	public static void main(String[] args) {
		int[] array=ArrayOperations.readArray();
		int sum=isEvenIndexSum(array);
		System.out.println("Sum of even Index elements is: "+sum);
	}
	
	public static int isEvenIndexSum(int[] array)
	{
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			if(i%2==0)
				sum+=array[i];
		}
		return sum;
	}
}
