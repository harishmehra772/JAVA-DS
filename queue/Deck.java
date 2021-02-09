package queue;
import java.util.*;
public class Deck {
	public static void main(String args[])
	{
//		ArrayDeque<Integer> stack=new ArrayDeque<>();
//		ad.addFirst(1);
//		ad.addLast(2);
//		ad.addLast(3);
//		ad.addFirst(0);
//		System.out.println(ad);
//		System.out.println(ad.removeFirst());
//		System.out.println(ad);
//		stack.push(21);
//		stack.push(20);
//		stack.push(19);
//		System.out.println(stack.pop());
//		System.out.println(stack);
		MyDeque<Integer> md=new MyDeque<>();
		md.addToHead(23);
		md.addToHead(34);
		md.addToTail(21);
		System.out.println(md.removeFromTail());
		
	}

}
