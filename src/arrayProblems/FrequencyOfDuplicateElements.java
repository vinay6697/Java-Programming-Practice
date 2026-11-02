package arrayProblems;

public class FrequencyOfDuplicateElements {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		isFrequency(ar);
	
	}
	
	public static void isFrequency(int[] ar)
	{
		boolean[] visited=new boolean[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			
			if(visited[i])
				continue;
			
			int count=1;
			
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
					visited[j]=true;
				}
			}
			if(count>1)
				System.out.println(ar[i]+"----->"+count);
		}
	}
	
	
}
