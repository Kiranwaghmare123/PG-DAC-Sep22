import java.util.ArrayList;

class Graph{
	ArrayList<ArrayList<Integer>> graph;
	int V;
	
	Graph(int nodes)
	{
		V=nodes;
		graph =new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<V;i++)
			graph.add(new ArrayList<Integer>());
		
	}
	
	void addEdge(int v, int u)
	{
		graph.get(v).add(u);
		//graph.get(u).add(v);
	}
	
	void display()
	{
		for(int i=0;i<V;i++)
		{
				System.out.println("Node : "+i);
				for(int x: graph.get(i))
					System.out.println("-->"+x);
				
				
		}
	}
	
	public static void main(String args[])
	{
		Graph g = new Graph(6);
		g.addEdge(1,2);
		g.addEdge(2,4);
		g.addEdge(1,3);
		g.addEdge(3,4);
		g.addEdge(3,5);
		g.addEdge(4,5);
		g.display();
	}
}