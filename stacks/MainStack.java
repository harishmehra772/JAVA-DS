package stacks;
import java.util.*;

public class MainStack {
	public static void main(String args[])
	{
		Stack<Integer> v=new Stack();
		v.push(23);
		v.push(56);
		v.push(69);
		int top=v.peek();
		System.out.println(v+""+top);
	}

}
