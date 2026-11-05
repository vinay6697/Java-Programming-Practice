package arrayProblems;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FrequencyOfDuplicateElements {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		isFrequency(ar);
		isFrequencyCount(ar);
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
	
	//solved using HashMap reducing the time complexity to O(n)average
	public static void isFrequencyCount(int[] ar)
	{
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		for(int i=0;i<ar.length;i++)
		{
			hm.put(ar[i], hm.getOrDefault(ar[i], 0)+1);
		}
		
		Set<Entry<Integer,Integer>> entries=hm.entrySet();
		
		for(Entry<Integer,Integer> entry:entries)
		{
			if(entry.getValue()>1)
				System.out.println(entry.getKey()+"------>"+entry.getValue());
		}
	}
}
