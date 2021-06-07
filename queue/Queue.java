package queue;
import java.util.*;

public class Queue {
	
	int rear,front,size;
	int q[];

	
	Queue(int size)
	{
		this.size=size;
		rear=-1;
		front=-1;
		q=new int[size];
		
	}
	
	boolean isEmpty( )
	{
		return(front==-1);
	}
	
	boolean isFull()
	{
		return(rear==size-1);
	}
	
	void enqueue(int data)
	{
		if(isFull())
			System.out.println("Queue is full");
		else if(isEmpty())
		{
			q[++rear]=data;
			front++;
		}
		else
		q[++rear]=data;
	}
	
	void dequeue()
	{
		if(isEmpty())
			System.out.println("Queue is empty");
		else 
			System.out.println("Deleted "+q[front++]);
	}
	
	void print()
	{
		if(isEmpty())
			System.out.println("Queue is empty.");
		else
		{
		
		while(front <rear+1)
		{
			System.out.print(q[front]+" ");
			front++;
		}
		}
	}

}



