package queue;
import franeWork.MyLinkedList.Node;
public class MyQueue <E>{
	Node <E> front,rear;
	public void enqueue(E e)
	{
		Node<E> toadd=new Node<>(e);
		if(front==null)
		{
			front=rear=toadd;
			return;
		}
		rear.next=toadd;
		rear=rear.next;
	}
	
	public E dequeue()
	{
	Node<E> temp=front;
	if(front==null)
	{
		return null;
	}
	if(front==rear)
	{
		temp=front;
		front=rear=null;
		return temp.data;
	}
	front=front.next;
	return temp.data;
	
	}
}
