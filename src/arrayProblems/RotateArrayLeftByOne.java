package arrayProblems;

public class RotateArrayLeftByOne {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		isRotateArray(ar);
	}
	
	public static void isRotateArray(int[] ar)
	{
			int temp=ar[0];
			int j=1;
			
			while(j<ar.length)
			{
				ar[j-1]=ar[j];
				j++;
			}
			
			ar[ar.length-1]=temp;
		
		ArrayOperations.display(ar);
	}
}
