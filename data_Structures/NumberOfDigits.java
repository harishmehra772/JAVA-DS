package data_Structures;
import java.util.*;
import java.lang.*;

public class NumberOfDigits {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		double n=sc.nextDouble();
		System.out.println("The number of digits in "+n+" is : "+(int)num_digits(n));
		
	}
	static double num_digits(double a)
	{
		double digits=0;
		digits=Math.floor(Math.log(a)/Math.log(10)+1);
		
		
		return digits;
	}

}
