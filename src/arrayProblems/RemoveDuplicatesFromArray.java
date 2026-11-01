package arrayProblems;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		isRemoveDuplicates(ar);
		isRemove(ar);
	}
	
	public static void isRemoveDuplicates(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			int count=0;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
					ar[j]=Integer.MIN_VALUE;
				}
			}
			if(count>0 && ar[i]!=Integer.MIN_VALUE)
				System.out.println(ar[i]);
		}
		int size=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=Integer.MIN_VALUE)
				size++;
		}
		
		int[] br=new int[size];
		int j=0;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=Integer.MIN_VALUE)
				br[j++]=ar[i];
		}
		ArrayOperations.display(br);
	}
	
	//using linkedHashSet to solve the problem
		public static void isRemove(int[] ar)
		{
			LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
			
			for(int i=0;i<ar.length;i++)
			{
				lhs.add(ar[i]);
			}
			int[] br=new int[lhs.size()];
			
			int j=0;
			
			for(int num:lhs)
			{
				br[j++]=num;
			}
			ar=br;
			ArrayOperations.display(ar);
		}
	
}
