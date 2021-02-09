package queue;
import java.util.*;
public class MainPriority {
	public static void main(String args[])
	{
		PriorityQueue<String> fruits=new PriorityQueue<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Apricot");
		System.out.println(fruits);
		System.out.println(fruits.poll());
		System.out.println(fruits.poll());
		System.out.println(fruits.poll());
		System.out.println(fruits.poll());
	}

}
