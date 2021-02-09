package vect;
import java.util.*;
public class MainVector {
	public static void main(String args[])
	{
		Vector<Integer> v=new Vector();
		v.add(4);
		v.add(6);
		v.add(87);
		System.out.println(v);
		v.remove(0);
		
		System.out.println(v);
	}

}
