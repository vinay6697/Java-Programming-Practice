package sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int[] ar= {15,16,6,8,5};
		isBubbleSort(ar);
	}
	
	public static void isBubbleSort(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length-1-i;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<ar.length;i++)
		{
				System.out.print(ar[i]+" ");
		}
	}

}
