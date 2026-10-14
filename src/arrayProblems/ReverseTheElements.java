package arrayProblems;

public class ReverseTheElements {
	public static void main(String[] args) {
		int[] array=ArrayOperations.readArray();
		 int[] br=isReverse(array);
		 ArrayOperations.display(br);
		isReverseUsingTempVariable(array);
	}
	
	public static int[] isReverse(int[] array)
	{
		int[] br=new int[array.length];
		int j=0;
		for(int i=array.length-1;i>=0;i--)
		{
			br[j++]=array[i];
		}
		
		return br;
	}
	
	public static void isReverseUsingTempVariable(int[] array)
	{
		int i=0;
		int j=array.length-1;
		while(i<j)
		{
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			
			i++;
			j--;
		}
		
		ArrayOperations.display(array);
	}
}
