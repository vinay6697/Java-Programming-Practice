package arrayProblems;

public class AverageOfArrayElements {
	public static void main(String[] args) {
		int[] array=ArrayOperations.readArray();
		double average=isAverage(array);
		System.out.println("Average of array elements is: "+average);
	}
	
	public static double isAverage(int[] array)
	{
		 if (array.length == 0) {
		        throw new IllegalArgumentException("Array cannot be empty");
		    }
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
		}
		double average=(double)sum/array.length;
		return average;
	}

}
