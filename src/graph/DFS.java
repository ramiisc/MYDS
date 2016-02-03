package graph;

import java.util.List;
import java.util.Stack;

public class DFS {
	public static Graph g = Graph.createGraph();
	
	public static int getAdjacentByMatrix(int v, Graph g) { 
		for(int i = 0; i < g.N;i++) {
			if(g.AMATRIX[v][i] == 1 && g.visited[i] == false) {
				return i;
			}
		}
		return -1;
		
	}
	
	public static int getAdjacentByList(int v, Graph g) { 
		for(int i  : g.ALIST[v] ) {
			if(g.visited[i] == false) {
				return i;
			}
		}
		return -1;
		
	}

	public static void dfs(int start) { 
		Stack<Integer> stack = new Stack<>();
		int v;
		int AV;
		stack.push(g.V[start]);
		g.visited[start] = true;
		System.out.print("DFS:");
		 System.out.print(start+" ");
		while(!stack.isEmpty()) {
			v = stack.peek();
			AV = getAdjacentByMatrix(v,g);
//			AV = getAdjacentByList(v,g);
			if(AV != -1) {
				stack.push(AV);
				g.visited[AV] = true;
				 System.out.print(AV+" ");
			} else {
				stack.pop();
			}
			
		}
		
	}
	public static void main(String args[]) { 
		dfs(2);
	}

}
