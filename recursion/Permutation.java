package recursion;
import java.util.*;
public class Permutation {
		static String stringSwap(String str,int i,int j)
		{
			StringBuilder sb=new StringBuilder(str);
			sb.setCharAt(i,str.charAt(j));
			sb.setCharAt(j,str.charAt(i));
			return sb.toString();
		}
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string ");
			String str=sc.nextLine();
			permute(str,0,str.length()-1);
		}
		static void permute(String str,int l,int r)
		{
			if(l==r)
			{
				System.out.println(str);
				return;
			}
			for(int i=l;i<=r;i++)
			{
				str=stringSwap(str,l,i);
				permute(str,l+1,r);
				str=stringSwap(str,l,i);
			}
		}
		

}
