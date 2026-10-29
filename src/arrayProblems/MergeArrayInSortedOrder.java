package arrayProblems;

import java.util.TreeSet;

public class MergeArrayInSortedOrder {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		int[] br=ArrayOperations.readArray();
		
		isMergeSorted(ar,br);
		isMerged(ar, br);
	}
	
	public static void isMergeSorted(int[] ar,int[] br)
	{
		int[] cr=new int[ar.length+br.length];
		int i=0;
		int j=0;
		int k=0;
		
		while(i<ar.length && j<br.length)
		{
				if(ar[i]<br[j])
					cr[k++]=ar[i++];
					
				else
					cr[k++]=br[j++];
			
		}
		
		//copying remaining elements from first array
		while(i<ar.length)
		{
			cr[k++]=ar[i++];
		}
		
		//copying remaining elements from second array 
		while(j<br.length)
		{
			cr[k++]=br[j++];
		}
		ArrayOperations.display(cr);
	}
	
	//this code works only if there are not duplicates presents 
	public static void isMerged(int[] ar,int[] br)
	{
		TreeSet<Integer> ts=new TreeSet<>();
		
		for(int i=0;i<ar.length;i++)
			ts.add(ar[i]);
		
		for(int j=0;j<br.length;j++)
			ts.add(br[j]);
		
		System.out.println(ts);
	}
}
