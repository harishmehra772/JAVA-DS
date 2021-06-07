package strings;
import java.util.*;

public class rotation {
	
	static boolean rotate(String str1,String str2)
	{
		if((str1.length()==str2.length())&&
				(str1+str1).contains(str2))
		return true;
		else return false;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the strings:");
		String str1=sc.next();
		String str2=sc.next();
		System.out.println("Strings are rotations of each other? "+rotate(str1,str2));
	}

}
