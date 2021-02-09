package franeWork;

public class MyLinkedList<E> {
	Node<E> head;
	void add(E data)
	{
		Node<E> toadd=new Node<E>(data);
		if(isEmpty())
		{
			head=toadd;
			return;
		}
		Node<E> temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=toadd;
	}
	void print()
	{
		Node<E> temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	boolean isEmpty()
	{
		return head==null;
	}
	public static class Node<E>
	{
		public E data;
		public Node<E> next=null;
		public Node(E data)
		{
			this.data=data;
			next =null;
		}
	}

}
