package Lec36;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

	HashMap<Integer, HashMap<Integer, Integer>> graph;
	// HM<V1,HM<V2,wt>>

	Graph() {
		graph = new HashMap<>();
	}

	public void addEdge(int src, int des, int wt) {
		if (!graph.containsKey(src)) {
			graph.put(src, new HashMap<>());
		}
		graph.get(src).put(des, wt);
	}

	public boolean isNbr(int src, int des) {
		if (graph.containsKey(src) && graph.get(src).containsKey(des)) {
			return true;
		}
		return false;
	}

	public int getWt(int src, int des) {
		if (graph.containsKey(src) && graph.get(src).containsKey(des)) {
			return graph.get(src).get(des);
		}
		return -1;
	}

	public int removeEdge(int src, int des) {
		int wt = getWt(src, des);
		if (wt != -1) {
			graph.get(src).remove(des);

			if (graph.get(src).size() == 0) {
				graph.remove(src);
			}
		}
		return wt;
	}

	public int noOfEdges() {
		int count = 0;
		for (Integer key : graph.keySet()) {
			count += graph.get(key).size();
		}
		return count;
	}

	public boolean hasPath(int src, int des) {
		if (!graph.containsKey(src)) {
			return false;
		}
//		return dfs(src, des, new HashSet<>());
		return bfs(src, des);
	}

	private boolean bfs(int src, int des) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(src);
		HashSet<Integer> vis = new HashSet<>();
		vis.add(src);
		while (!queue.isEmpty()) {
			System.out.println(queue);
			int level = queue.size(); // no of elements in this level
			
			while (level != 0) {
				int rn = queue.poll();
				level--;
				if (rn == des) {
					return true;
				}
				if (graph.containsKey(rn)) {
					HashMap<Integer, Integer> neighbours = graph.get(rn);
					for (Integer key : neighbours.keySet()) {
						if (vis.contains(key)) {
							continue;
						}
						queue.add(key);
						vis.add(key);
					}
				}
			}
		}

		return false;
	}

	private boolean dfs(int src, int des, HashSet<Integer> vis) {
		if (src == des) {
			return true;
		}
		boolean res = false;
		vis.add(src);
		HashMap<Integer, Integer> neighbours = graph.get(src);
		for (Integer nbr : neighbours.keySet()) {
			if (vis.contains(nbr)) {
				continue;
			}
			res = res || dfs(nbr, des, vis);
		}
		return res;
	}

	@Override
	public String toString() {
		ArrayList<String> res = new ArrayList<>();
		for (Integer key : graph.keySet()) {
			res.add(key + " => " + graph.get(key));
		}
		return res.toString();
	}
}
