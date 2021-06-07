package strings;
import java.util.*;

public class RabinKarp {
	public static int d=256;
	
	public static void search(String text,String pattern ,int q)
	{
		int M=pattern.length();
		int N=text.length();
		int p=0;
		int t=0;
		int h=1;
		int j;
		for(int i=0;i<M-1;i++)
		h=(h*d)%q;
		
		for(int i=0;i<M;i++)
		{
			p=(d*p+pattern.charAt(i))%q;
			t=(d*t+text.charAt(i))%q;
		}
		
		for(int i=0;i<=N-M;i++)
		{
			if(p==t)
			{
				for( j=0;j<M;j++)
				{
					if(text.charAt(i+j)!=pattern.charAt(j))
						break;
				}
				if(j==M)
					System.out.println("Found at index:"+i);
				
			}
			
			if(i<N-M)
			{
				t=(d*(t-text.charAt(i)*h)+text.charAt(i+M))%q;
				
				if(t<0)
				t=t+q;
			}
			
			
		}
	}
		
		public static void main(String args[])
		{
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter the text :");
			String text=sc.next();
			System.out.println("Enter the pattern:");
			String pattern=sc.next();
			int q=101;
			search(text,pattern,q);
			
		}
}
