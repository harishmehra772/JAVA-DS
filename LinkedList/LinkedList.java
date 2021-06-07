package LinkedList;
import java.util.*;

public class LinkedList {
	 
	
	static Node head;
	public static class Node
	{
		int data;
		Node next=null;
		Node(int d)
		{
			data=d;
			next=null;
		}
		
	}
	
	static void push(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	
	static boolean detectLoop(Node h)
	{
		HashSet <Node>s=new  HashSet<>();
		while(h!=null)
		{
			if(s.contains(h.next))
				return true;
			s.add(h);
			h=h.next;
		}
		return false;
	}
	
	static boolean Floyd()
	{
		Node slow=head;
		Node fast=head;
		while(slow!=null&&fast!=null&&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String args[])
	{
		LinkedList ll=new LinkedList();
		ll.push(20);
		ll.push(10);
		ll.push(5);
		ll.push(200);
		
		ll.head.next.next.next.next = ll.head;
		
		if(Floyd())
			System.out.println("Loop is there");
		else 
			System.out.println("No Loop!");
	}
	
	

}
