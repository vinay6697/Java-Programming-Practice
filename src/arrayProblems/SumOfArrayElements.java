package arrayProblems;

public class SumOfArrayElements {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		int sum=isSum(ar);
		System.out.println("sum of array elements: "+sum);
	}
	
	public static int isSum(int[] array)
	{
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		return sum;
	}

}
