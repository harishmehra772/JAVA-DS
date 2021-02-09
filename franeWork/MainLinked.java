package franeWork;
import java.util.*;

public class MainLinked {

	public static void main(String[] args) {
//		List<Integer> ll=new LinkedList<>();
//		List<Integer> al=new ArrayList<>();
//		getTimeDifference(ll);
//		getTimeDifference(al);
		MyLinkedList<String> ml=new MyLinkedList();
		ml.add("Ram");
		ml.add("Shyam");
		ml.add("KAm");
		ml.print();
		}
//	static void getTimeDifference(List<Integer> list)
//	{
//		long startTime=System.currentTimeMillis();
//		for(int i=0;i<100000;i++)
//		{
//			list.add(0,i);
//		}
//		long endTime=System.currentTimeMillis();
//		System.out.println(list.getClass().getName()+" "+
//		(endTime-startTime));
//	}

}
