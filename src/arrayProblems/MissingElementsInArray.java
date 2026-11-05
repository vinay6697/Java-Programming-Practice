package arrayProblems;

import java.util.Arrays;

public class MissingElementsInArray {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		isMissing(ar);
	}
	
	public static void isMissing(int[] ar)
	{
		Arrays.sort(ar);
		boolean flag=false;
		for(int i=0;i<ar.length-1;i++)
		{
			int min=ar[i];
			int max=ar[i+1];
			
			for(int j=min+1;j<max;j++)
			{
				if(j<max)
				{
					System.out.print(j+" ");
					flag=true;
				}
			}
		}
		if(!flag)
			System.out.println("no missing elements found");
	}
}
