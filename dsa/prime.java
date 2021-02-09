package dsa;
import java.util.*;

public class prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number;
		int flag=0;
		System.out.println("Enter the number to be checked:");
		number=sc.nextInt();
		if(number==1||number==0)
			System.out.println("Not Prime");
		else
		{
		for(int i=2;i<number/2;i++)
		{
			if(number%i==0)
				{
				System.out.println("Not Prime");
				flag=1;
				break;
				
				}
			
		}
		}
		if(flag==0)
		System.out.println("Prime");
		

	}

}
