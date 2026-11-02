package arrayProblems;

public class FrequencyOfEachElement {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		isFrequency(ar);
	}
	
	public static void isFrequency(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
					ar[j]=Integer.MIN_VALUE;
				}
			}
			if(ar[i]!=Integer.MIN_VALUE)
				System.out.println(ar[i]+"---->"+count);
		}
	}

}
