package arrayProblems;

public class MissingNumberInArray {
	public static void main(String[] args) {
		int[] ar= {0, 1, 2, 4, 5, 6};
		System.out.println(missingNumber(ar));
	}
	public static int missingNumber(int[] nums) {
	       int[] hash=new int[nums.length+1];

	        for(int i=0;i<nums.length;i++)
	        {
	            hash[nums[i]]=1;;
	        }
	        
	        for(int i=0;i<hash.length;i++)
	        {
	            if(hash[i]==0)
	                return i;
	        }
	        return nums[nums.length-1];
	   
	    }
}
