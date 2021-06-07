package strings;
import java.util.*;

public class KMP {
	
		static void search(String text,String pattern)
		{
			int M=pattern.length();
			int N=text.length();
			int lps[]=new int[M];
			computeLPS(lps,pattern);
			int i=0;
			int j=0;
			while(i<N)
			{
				if(pattern.charAt(j)==text.charAt(i))
				{
					i++;
					j++;
				}
				if(j==M)
				{
					System.out.println("Pattern found at index :"+(i-j));
					j=lps[j-1];
				}
				else if(i<N && pattern.charAt(j)!=text.charAt(i))
				{
					if(j!=0)
						j=lps[j-1];
					else i=i+1;
				}
			}
			
			
		}
	
	
		static void computeLPS(int lps[],String pattern)
		{
			int M=pattern.length();
			lps[0]=0;
			int len=0;
			int i=1;
			while(i<M)
			{
				if(pattern.charAt(i)==pattern.charAt(len))
				{
					len++;
					lps[i]=len;
					i++;
				}
				else
				{
					if(len!=0)
					{
						len=lps[len-1];
					}
					else
					{
						lps[i]=len;
						i++;
					}
				}
			}
			
		}
		
		public static void main(String args[])
		{
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter the text:");
			String text=sc.next();
			System.out.println("Enter the pattern:");
			String pattern=sc.next();
			search(text,pattern);
			
		}
}
