package recursion;
import java.util.*;

public class IsPalindrome {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.nextLine();
		System.out.println("The string is : "+isPalin(str,0,str.length()-1) );
	}
	static boolean isPalin(String str,int l,int r)
	{
		if(l>=r)
		return true;
		if(str.charAt(l)!=str.charAt(r))
		return false;
		return isPalin(str,l+1,r-1);
	}

}
