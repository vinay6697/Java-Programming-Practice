package arrayProblems;

public class MedianOfTwoSortedMergedArrays {
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
		
		System.out.println();
		double median=0;
		if(cr.length%2==0)
			median =(cr[cr.length/2]+cr[(cr.length/2)-1])/2;
		else
			median=cr[cr.length/2];
		
		System.out.println(median);
			
	}
}
