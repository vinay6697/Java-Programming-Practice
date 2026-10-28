package arrayProblems;

public class MergeArrayInSortedOrder {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		int[] br=ArrayOperations.readArray();
		
		isMergeSorted(ar,br);
	}
	
	public static void isMergeSorted(int[] ar,int[] br)
	{
		int[] cr=new int[ar.length+br.length];
		int i=0;
		int j=0;
		int k=0;
		
		while(k<cr.length)
		{
			if(i<ar.length && j<br.length)
			{
				if(ar[i]<br[j])
					cr[k++]=ar[i++];
					
				else
					cr[k++]=br[j++];
			}
			else if(i<ar.length)
				cr[k++]=ar[i++];
			else if(j<br.length)
				cr[k++]=br[j++];
			
		}
		ArrayOperations.display(cr);
	}
}
