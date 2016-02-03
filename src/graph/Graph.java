package graph;

import java.util.LinkedList;
import java.util.List;

public class Graph {
	int V[];
	boolean visited[];
	List<Integer> ALIST[];
	int AMATRIX[][];
	int N;

	public Graph(int n) {
		N = n;
		V = new int[n];
		visited = new boolean[n];
		ALIST = new LinkedList[n];
		AMATRIX = new int[n][n];

		for (int i = 0; i < n; i++) {
			V[i] = i;
		}

		for (int i = 0; i < n; i++) {
			visited[i] = false;
		}
		for (int i = 0; i < n; i++) {
			ALIST[i] = new LinkedList<>();
		}
	}

	public void addEdge(int v1, int v2) {
		AMATRIX[v1][v2] = 1;
//		AMATRIX[v2][v1] = 1;
		ALIST[v1].add(v2);
//		ALIST[v2].add(v1);

	}

	public static Graph createGraph() {
		Graph g = new Graph(5);
		g.addEdge(0, 1);
		g.addEdge(1, 0);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 1);
		g.addEdge(3, 1);
		g.addEdge(3, 4);
		g.addEdge(4, 3);
		for(int i = 0; i < g.ALIST.length; i++) {
			System.out.println("vertex:" + i +" LIST SIZE: "+g.ALIST[i].size());
		}
		return g;

	}

}
