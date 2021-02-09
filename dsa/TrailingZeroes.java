package dsa;
import java.util.*;
public class TrailingZeroes {
	static int answer(int n)
	{
		int count=0;
		for(int i=5;n>=i;i*=5)
		{
			count+=n/i;
		}
		return count;
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:  ");
		int number=sc.nextInt();
		int solution=answer(number);
		System.out.println("The number of trailing zeroes are "+solution);
	}
}
