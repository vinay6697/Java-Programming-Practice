package arrayProblems;

public class MaximumConsecutiveOnes {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		int result=isMax(ar);
		System.out.println(result);
	}
	
	public static int isMax(int[] nums)
	{
		int max=0;
        int count=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
                max=Math.max(max, count);
                
            }
            else
            	count=0;

            
        }
        return max;
	}

}
