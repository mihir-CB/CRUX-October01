package Lec36;

public class GraphClient {

	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.addEdge(0, 1, 5);
		graph.addEdge(1, 2, 10);
		graph.addEdge(3, 1, 20);
		graph.addEdge(1, 4, 6);
		graph.addEdge(2, 3, 2);
		graph.addEdge(3, 4, 3);
		graph.addEdge(4, 5, 10);
		graph.addEdge(5, 6, 9);
		graph.addEdge(5, 7, 14);
		graph.addEdge(6, 7, 3);
		System.out.println(graph);
//		System.out.println(graph.getWt(5, 6));
//		graph.removeEdge(0, 1);
//		System.out.println(graph);
//		
//		System.out.println(graph.hasPath(1,7));
		
	

	}

}
