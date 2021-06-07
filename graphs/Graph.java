package graphs;
import java.util.*;

public class Graph {
	
	private LinkedList<Integer>adj[];
	
	public Graph(int v)
	{
		adj=new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			adj[i]=new LinkedList<Integer>();
		}
		
	}
	
	public void addEdge(int source,int destination)
	{
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	
	public int bfs(int source ,int destination)
	{
		boolean visited[]=new boolean[adj.length];
		int parents[]=new int[adj.length];
		parents[source]=-1;
		Queue<Integer> q=new LinkedList();
		q.add(source);
		visited[source]=true;
		while(!q.isEmpty())
		{
			int cur=q.poll();
			if(cur==destination)
			break;
			for(int neighbour:adj[cur])
			{
				if(!visited[neighbour])
				{
					q.add(neighbour);
					visited[neighbour]=true;
					parents[neighbour]=cur;
					
				}
			}
		}
		int cur=destination;
		int distance=0;
		while(parents[cur]!=-1)
		{
			System.out.print(cur+"->");
			cur=parents[cur];
			distance++;
			
		}
		System.out.print(source);
		
		return distance;
	}
	
	private boolean dfsUtil(int source,int destination,boolean visited[])
	{
		if(source==destination)
			return true;
		
		for(int neighbour:adj[source])
		{
			if(!visited[neighbour])
			{
				visited[neighbour]=true;
				boolean isConnected=dfsUtil(neighbour,destination,visited);
				if(isConnected)return true;
			}
		}
		return false;
		
	}
	
	public boolean dfs(int source,int destination)
	{
		boolean visited[]=new boolean[adj.length];
		visited[source]=true;
		return dfsUtil(source ,destination,visited);
	}
	
	public boolean dfsStack(int source ,int destination)
	{
		boolean visited[]=new boolean[adj.length];
		visited[source]=true;
		Stack<Integer> stack=new Stack<>();
		stack.push(source);
		while(!stack.isEmpty())
		{
			int cur=stack.pop();
			if(cur==destination)
				return true;
			for(int neighbour:adj[cur])
			{
				if(!visited[neighbour])
				{
					visited[neighbour]=true;
					stack.push(neighbour);
					
					
				}
			}
		}
		return false;
		
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of vertices and edges");
		int v=sc.nextInt();
		int e=sc.nextInt();
		Graph graph=new Graph(v);
		System.out.println("Enter "+e+" edges:");
		for(int i=0;i<e;i++){
			int source=sc.nextInt();
			int destination=sc.nextInt();
			graph.addEdge(source,destination);
		}
		System.out.println("Enter the source and the destination:");
		int source=sc.nextInt();
		int destination=sc.nextInt();
		System.out.println(graph.dfsStack(source,destination));
		
		//	System.out.println("Distance:"+graph.bfs(source,destination));
			
		
		
	}

}
