package arrayProblems;

public class FirstMaximumNumber {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		int fmax=isFirstMax(ar);
		System.out.println("First maximum element is: "+fmax);
	}
	
	public static int isFirstMax(int[] ar)
	{
		int fmax=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>fmax)
				fmax=ar[i];
		}
		return fmax;
	}

}
