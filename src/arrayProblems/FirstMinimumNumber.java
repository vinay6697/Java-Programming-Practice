package arrayProblems;

public class FirstMinimumNumber {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		firstMinimum(ar);
	}
	
	public static void firstMinimum(int[] ar)
	{
		if(ar.length==0 || ar==null)
		{
			System.out.println("no result");
		}
		int fmin=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<fmin)
				fmin=ar[i];
		}
		System.out.println("First minimum element is: "+fmin);
	}

}
