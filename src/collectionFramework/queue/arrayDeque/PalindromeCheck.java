package collectionFramework.queue.arrayDeque;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		if(isPalindrome(str))
			System.out.println("It is palindrome");
		else
			System.out.println("It is not palindrome");
		sc.close();
	}
	
	public static boolean isPalindrome(String str)
	{
		str=str.replaceAll("\\s+", "").toLowerCase();
		char[] ch=str.toCharArray();
		ArrayDeque<Character> ad=new ArrayDeque<>();
		for(int i=0;i<ch.length;i++)
		{
			ad.add(ch[i]);
		}
		
		while(ad.size()>1)
		{
			char ch1=ad.pollFirst();
			char ch2=ad.pollLast();
			
			if(ch1!=ch2)
				return false;
		}
		return true;
	}
}
