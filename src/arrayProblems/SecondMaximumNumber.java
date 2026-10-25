package arrayProblems;

public class SecondMaximumNumber {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		isSecondMax(ar);
	}
	
	public static void isSecondMax(int[] ar)
	{
		if(ar.length==0 || ar==null)
		{
			System.out.println("no result");
		}
		else
		{
			int fmax=ar[0];
			int smax=0;
			
			for(int i=0;i<ar.length;i++)
			{
				if(ar[i]>fmax)
				{
					smax=fmax;
					fmax=ar[i];
				}
				else if(ar[i]!=fmax && ar[i]>smax)
				{
					smax=ar[i];
				}
				
			}
			System.out.println("Second maximum element is: "+smax);
		}
	}
}
