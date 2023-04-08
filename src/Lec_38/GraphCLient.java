package Lec_38;

public class GraphCLient {

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
		
		graph.addEdge(8, 9, 10);
		System.out.println(graph);
//		System.out.println(graph.noOfComponents());
//		System.out.println(graph.isCyclic());
//		System.out.println(graph.isTree());
		
		System.out.println(graph.shortestDistance(0, 7));

	}

}
