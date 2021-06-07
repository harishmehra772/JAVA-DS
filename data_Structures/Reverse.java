package data_Structures;
import java.util.*;

public class Reverse {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be revesed:");
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		while(n>0)
		{
			rev*=10;
			rev+=n%10;
			n/=10;
			
		}
		if(temp==rev)
		{
		System.out.println("The number is palindrome"+rev);
		}
		else System.out.println("The number is not palindrome."+rev);
		
	}

}
