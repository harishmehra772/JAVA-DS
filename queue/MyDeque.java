package queue;

public class MyDeque<E> {
	Node<E> head,tail;
	public void addToHead(E data)
	{
		Node<E> toadd=new Node<>(data);
		if(head==null)
		{
			head=tail=toadd;
			return;
		}
		else
		{
			toadd.next=head;
			head.prev=toadd;
			head=toadd;
			
		}
		
	}
	public void addToTail(E data)
	{
		Node<E> toadd=new Node<>(data);
		if(head==null)
		{
			head=tail=toadd;
			return;
		}
		else
		{
			toadd.prev=tail;
			tail.next=toadd;
			tail=toadd;
		}
		
	}
	public E removeFromTail()
	{
		if(head==null)
			return null;
		Node<E> temp=tail;
		tail=tail.prev;
		tail.next=null;
		if(tail==null)
		{head=null;}
		return temp.data;
	}
	public static class Node<E>
	{
		E data;
		Node<E> next;
		Node<E> prev;
		public Node(E data)
		{
			this.data=data;
			this.next=this.prev=null;
		}
	}

}
