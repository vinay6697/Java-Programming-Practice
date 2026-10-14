package arrayProblems;

public class ReverseTheElements {
	public static void main(String[] args) {
		int[] array=ArrayOperations.readArray();
		 int[] br=isReverse(array);
		 ArrayOperations.display(br);
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
	
}
