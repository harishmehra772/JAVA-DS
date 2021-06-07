package recursion;
import java.util.*;
public class Josephus {
		static int josephus(int n,int k)
		{ 
			if(n==1)
				return 0;
			return (josephus(n-1,k)+k)%n;
		}
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size and the k value:");
			int n=sc.nextInt();
			int k=sc.nextInt();
			System.out.println("The position is: "+josephus(n,k));
		
		
		}


}
