package recursion;
import java.util.*;

public class PermutaionCase {
	
	static void permutation(String s,int n,String curr)
	{
		if(n==s.length())
		{
			System.out.print(curr+" ");
			return;
		} 
		if(Character.isDigit(s.charAt(n)))
			{
			  permutation(s,n+1,curr+s.charAt(n));
				}
		else
		{
		permutation(s,n+1,curr+Character.toUpperCase(s.charAt(n)));
		permutation(s,n+1,curr+Character.toLowerCase(s.charAt(n)));
		}
		return;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String curr="";
		System.out.println("Permuatations are:");
		permutation(s,0,curr);
		
	}

}

