package queue;

public class Qlink<E>  {
	Node<E> head;
	
	static class Node<E>{
		E data;
		Node<E> next;
		
		Node(E data)
		{
			this.data=data;
			next=null;
		}
	}
		
		void enqueue(E data)
		{
			Node<E> new_node=new Node<E>(data);
			
			if(isEmpty())
			{
				head=new_node;
				return;
			}
			Node temp=head;
			while(temp.next!=null)
				temp=temp.next;
			temp.next=new_node;
			
		}
		
		void dequeue()
		{
			if(isEmpty())
			{
				System.out.println("Queue is empty.");
				return;
			}
			System.out.println(head.data+" Deleted.");
			head=head.next;
		}
		
		void print()
		{
			Node<E> temp=head;
			if(isEmpty())
			{
				System.out.println("Empty Queue");
				return;
			}
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
		
		boolean isEmpty()
		{
			return(head==null);
		}
		
		
	

}
