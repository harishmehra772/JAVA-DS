package queue;

public class Test {
	
	public static void main(String args[])
	{
		MyDeque<Integer>deq=new MyDeque<>();
//		deq.addFirst(10);
//		deq.addFirst(20);
//		deq.addFirst(30);
//		deq.addLast(0);
		
		deq.print();
		System.out.println(deq.removeLast()+"removed");
		deq.print();

	}

}
