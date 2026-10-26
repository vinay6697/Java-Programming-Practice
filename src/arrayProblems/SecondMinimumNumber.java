package arrayProblems;

public class SecondMinimumNumber {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		isSecondMax(ar);
	}
	
	public static void isSecondMax(int[] ar)
	{
		if(ar.length==0 || ar==null)
			System.out.println("No result");
		else
		{
			int fmin=ar[0];
			int smin=Integer.MAX_VALUE;
			
			for(int i=0;i<ar.length;i++)
			{
				if(ar[i]<fmin)
				{
					smin=fmin;
					fmin=ar[i];
				}
				if(ar[i]<smin && ar[i]!=fmin)
					smin=ar[i];
			}
			System.out.println(smin);
		}
	}
}
