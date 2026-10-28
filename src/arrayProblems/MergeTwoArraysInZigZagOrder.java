package arrayProblems;

public class MergeTwoArraysInZigZagOrder {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		int[] br=ArrayOperations.readArray();
		isZigZag(ar,br);
	}
	
	public static void isZigZag(int[] ar,int[] br)
	{
		int[] cr=new int[ar.length+br.length];
		
		int i=0;
		int j=0;
		int k=0;
		
		while(k<cr.length)
		{
			if(i<ar.length)
				cr[k++]=ar[i++];
			if(j<br.length)
				cr[k++]=br[j++];
		}
		ArrayOperations.display(cr);
		
	}

}
