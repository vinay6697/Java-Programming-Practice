package arrayProblems;

public class ProductOfArrayElements {
	public static void main(String[] args) {
		int[] array=ArrayOperations.readArray();
		int product=isProduct(array);
		System.out.println("Product of array element is: "+product);
	}
	
	public static int isProduct(int[] array)
	{
		int product=1;
		for(int i=0;i<array.length;i++)
		{
			product*=array[i];
		}
		return product;
	}
}
