package arrayProblems;

public class SquareAndCubesOfArrayElements {
	public static void main(String[] args) {
		int[] array=ArrayOperations.readArray();
		isSquareAndCube(array);
	}
	
	public static void isSquareAndCube(int[] array)
	{
		System.out.println("element\tsquare\t"+"cube");
		for(int i=0;i<array.length;i++)
		{
			long square=(long)(array[i]*array[i]);
			long cube=(long)(array[i]*array[i]*array[i]);
			System.out.println(array[i]+ "\t" +square+ "\t" +cube);
		}
	}
}
