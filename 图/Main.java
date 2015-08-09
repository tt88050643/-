public class Main{
	public static final int A_Edge = 0;
	public static final int B_Edge = 1;
	public static final int C_Edge = 2;
	
	public static void main(String[] args){
		
		Graph g = new Graph(3);
	
		g.addVertex('A');
		g.addVertex('B');
		g.addVertex('C');
		
		g.addEdge(A_Edge, B_Edge);
		g.addEdge(A_Edge, C_Edge);
		g.addEdge(C_Edge, B_Edge);
	}
}