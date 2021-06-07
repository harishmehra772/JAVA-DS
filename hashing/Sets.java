package hashing;
import java.util.*;

public class Sets {
	public static void main(String args[])
	{
		
		
		Map<String,Integer>numbers=new HashMap<>();
		numbers.put("one",1);
		numbers.put("two",2);
		System.out.println(numbers.keySet());
		
	Set<Integer> set1=new HashSet<>();
	set1.add(23);
	set1.add(32);
	set1.add(987);
	Set<Integer> set2=new HashSet<>();
	set2.add(23);
	set2.add(43);
	set2.addAll(set1);
	
	System.out.println(set2.containsAll(set1));
	}
	
	
	

}
