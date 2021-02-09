package queue;
import java.util.*;
public class MainQueue {
	public static void main(String args[])
	{
//		Queue<Integer> q=new LinkedList<>();
//		q.add(23);
//		q.add(24);
//		q.add(133);
//		System.out.println(q);
//		q.remove();
//		q.remove();
//		q.remove();
//		
//		
//		System.out.println(q.poll());
//	
		MyQueue<Integer> q=new MyQueue();
		q.enqueue(12);
		q.enqueue(24);
		q.enqueue(36);
		q.enqueue(48);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		
	}

}
