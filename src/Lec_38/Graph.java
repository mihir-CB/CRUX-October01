package Lec_38;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Graph {
	HashMap<Integer, HashMap<Integer, Integer>> graph;

	Graph() {
		graph = new HashMap<>();
	}

	public void addEdge(int src, int des, int wt) {
		if (!graph.containsKey(src)) {
			graph.put(src, new HashMap<>());
		}
		graph.get(src).put(des, wt);

		if (!graph.containsKey(des)) {
			graph.put(des, new HashMap<>());
		}
		graph.get(des).put(src, wt);

	}

	public int noOfComponents() {
		int c = 0;
		HashSet<Integer> vis = new HashSet<>();
		for (int key : graph.keySet()) {
			if (vis.contains(key)) {
				continue;
			}
			c++;
			vis.add(key);
			Queue<Integer> queue = new LinkedList<>();
			queue.add(key);
			while (!queue.isEmpty()) {
				int rn = queue.poll();

				for (int nbr : graph.get(rn).keySet()) {
					if (vis.contains(nbr)) {
						continue;
					}
					queue.add(nbr);
					vis.add(nbr);
				}
			}
		}
		return c;
	}

	public boolean isCyclic() {
		HashSet<Integer> vis = new HashSet<>();
		for (int key : graph.keySet()) {
			if (vis.contains(key)) {
				continue;
			}
			Queue<Integer> queue = new LinkedList<>();
			queue.add(key);
			while (!queue.isEmpty()) {
				int rn = queue.poll();
				if (vis.contains(rn)) {
					return true;
				}
				vis.add(rn);
				for (int nbr : graph.get(rn).keySet()) {
					if (vis.contains(nbr)) {
						continue;
					}
					queue.add(nbr);
				}
			}
		}
		return true;
	}

	public boolean isTree() {
		return !isCyclic() && (noOfComponents() == 1);
	}

	class DJPair implements Comparable<DJPair>{
		int nd;
		int wt;

		DJPair(int n, int w) {
			this.nd = n;
			this.wt = w;
		}

		@Override
		public int compareTo(DJPair o) {
			// this-o
			return this.wt-o.wt;
		}
	}

	public int shortestDistance(int src, int des) {
		HashSet<Integer> vis = new HashSet<>();

		PriorityQueue<DJPair> pq = new PriorityQueue<>();
		pq.add(new DJPair(src, 0));
		while (!pq.isEmpty()) {
			DJPair rn = pq.poll();
			if (des == rn.nd) {
				return rn.wt;
			}
			if (vis.contains(rn.nd)) {
				continue;
			}
			vis.add(rn.nd);
			for (int nbr : graph.get(rn.nd).keySet()) {
				if (vis.contains(nbr)) {
					continue;
				}
				pq.add(new DJPair(nbr, rn.wt + graph.get(rn.nd).get(nbr)));
			}

		}
		return Integer.MAX_VALUE;
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
