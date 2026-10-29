package arrayProblems;

public class CommonElements {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		int[] br=ArrayOperations.readArray();
		isCommon(ar,br);
	}
	
	public static void isCommon(int[] ar,int[] br)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<br.length;j++)
			{
				if(ar[i]==br[j])
				{
					System.out.println(br[j]);
					br[j]=Integer.MIN_VALUE;
				}
			}
		}
	}

}
