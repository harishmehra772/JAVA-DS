package dsa;
import java.util.*;
public class Euclidean {
	static int gcd(int number1,int number2)
	{
		if(number1==0)
			return number2;
		return gcd(number2%number1,number1);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int number1,number2;
		System.out.print("Enter the two numbers to find the HCF:");
		number1=sc.nextInt();
		number2=sc.nextInt();
		int HCF=gcd(number1,number2);
		System.out.println("The HCF of the number is : "+HCF);
		
	}

}
