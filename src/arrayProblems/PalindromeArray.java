package arrayProblems;

public class PalindromeArray {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		if(isPalindrome(ar))
			System.out.println("It is a palindrome Array");
		else
			System.out.println("It is not a palindrome Array");
	}
	
	public static boolean isPalindrome(int[] array)
	{
		int i=0;
		int j=array.length-1;
		while(i<j)
		{
			if(array[i]!=array[j])
				return false;
			i++;
			j--;
		}
		return true;
	}
}
