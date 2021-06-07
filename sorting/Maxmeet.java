package sorting;
import java.util.*;
class meeting
{
	int start;
	int end;
	int pos;
	meeting(int start,int end,int pos)
	{
		this.start=start;
		this.end=end;
		this.pos=pos;
	}
}

class mycomparator implements Comparator<meeting>
{
	public int compare(meeting o1,meeting o2)
	{
		if(o1.end<o2.end)
		{
			return -1;
		}
		else if(o1.end>o2.end)
			return 1;
		else return 0;
	}
}

public class Maxmeet {
	public static void maxMeeting(ArrayList<meeting> al,int size)
	{
		ArrayList<Integer> answer=new ArrayList();
		int time=0;
		mycomparator mc =new mycomparator();
		Collections.sort(al,mc);
		answer.add(al.get(0).pos);
		 time=al.get(0).end;
		
		for(int i=1;i<al.size();i++)
		{
			if(al.get(i).start>time)
			{
				answer.add(al.get(i).pos);
			time=al.get(i).end;
			}
		}
		for(int i=0;i<answer.size();i++)
		{
			System.out.print(answer.get(i)+1+" ");
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		int s[]=new int[n];
		int f[]=new int[n];
		System.out.println("First:");
		for(int i=0;i<n;i++)
		{
			s[i]=sc.nextInt();
		}	
		System.out.println("Second:");
		for(int i=0;i<n;i++)
		{
			f[i]=sc.nextInt();
		}
		
		ArrayList<meeting>meet=new ArrayList();
		for(int i=0;i<n;i++)
		{
			meet.add(new meeting(s[i],f[i],i));
		}
		maxMeeting(meet,meet.size());
	}

}

