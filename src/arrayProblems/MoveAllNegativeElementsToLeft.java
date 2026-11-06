package arrayProblems;

public class MoveAllNegativeElementsToLeft {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		isMoveElements(ar);
		isMove(ar);
	}
	
	public static void isMoveElements(int[] ar)
	{
		int[] br=new int[ar.length];
		int count=0;
		int j=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0)
			{
				br[j++]=ar[i];
				count++;
			}
		}
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>0)
				br[count++]=ar[i];
		}
		
		ArrayOperations.display(br);
	}
	public static void isMove(int[] ar) {

	    int count = 0;

	    for (int i = 0; i < ar.length; i++) {

	        if (ar[i] < 0) {

	            int temp = ar[i];

	            for (int j = i; j > count; j--) {
	                ar[j] = ar[j - 1];
	            }

	            ar[count] = temp;

	            count++;
	        }
	    }

	    ArrayOperations.display(ar);
	}
}
