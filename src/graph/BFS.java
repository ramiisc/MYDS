package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFS {
	public static Graph g = Graph.createGraph();

	public static int getAdjacentByMatrix(int v, Graph g) {
		for (int i = 0; i < g.N; i++) {
			if (g.AMATRIX[v][i] == 1 && g.visited[i] == false) {
				return i;
			}
		}
		return -1;

	}

	public static int getAdjacentByList(int v, Graph g) {
		for (int i : g.ALIST[v]) {
			if (g.visited[i] == false) {
				return i;
			}
		}
		return -1;

	}

	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList();
		int v;
		int AV;
		queue.add(g.V[start]);
		g.visited[start] = true;
		System.out.print("BFS:");
		System.out.print(start + " ");
		while (!queue.isEmpty()) {
			v = queue.remove();
			while (true) {
//				AV = getAdjacentByMatrix(v, g);
				AV = getAdjacentByList(v, g);
				if (AV == -1)
					break;
				queue.add(AV);
				g.visited[AV] = true;
				System.out.print(AV + " ");

			}

		}
	}

	public static void main(String args[]) {
		bfs(1);
	}
}
