package arrayProblems;

public class MergeTwoArrays {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		int[] br=ArrayOperations.readArray();
		isMerge(ar,br);
	}
	
	public static void isMerge(int[] ar,int[] br)
	{
		int[] cr=new int[ar.length+br.length];
		
		for(int i=0;i<cr.length;i++)
		{
			if(i<ar.length)
				cr[i]=ar[i];
			else
				cr[i]=br[i-ar.length];
		}
		ArrayOperations.display(cr);
	}
}
