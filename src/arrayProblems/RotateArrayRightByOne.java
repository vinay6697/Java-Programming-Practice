package arrayProblems;

public class RotateArrayRightByOne {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		isRightRotate(ar);
	}
	
	public static void isRightRotate(int[] ar)
	{
		int temp=ar[ar.length-1];
		
		int j=ar.length-2;
		
		while(j>=0) {
			ar[j+1]=ar[j];
			j--;
		}
		
		ar[0]=temp;
		
		ArrayOperations.display(ar);
	}
}
