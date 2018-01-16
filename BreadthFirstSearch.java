/**
 * Breadth First Search Algorithm implementation
**/

import java.util.*;

class BreadthFirstSearch{
	public static void main(String[] args) {
		BFS bfs = new BFS();
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		Vertex v6 = new Vertex(6);
		Vertex v7 = new Vertex(7);
		Vertex v8 = new Vertex(8);
		
		v1.addNeighbourVertex(v2);
		v1.addNeighbourVertex(v3);
		v1.addNeighbourVertex(v4);
		v2.addNeighbourVertex(v5);
		v5.addNeighbourVertex(v6);
		v5.addNeighbourVertex(v7);
		v3.addNeighbourVertex(v8);

		bfs.bfs(v1);
	}
}


class Vertex{
	private int data;
	private boolean visited;
	private List<Vertex> neighbourList;

	public Vertex(int data){
		this.data = data;
		this.neighbourList = new ArrayList<>();
	}

	public int getData(){
		return data;
	}

	public void setData(int data){
		this.data = data;
	}

	public boolean isVisited(){
		return visited;
	}

	public void setVisited(boolean visited){
		this.visited = visited;
	}

	public List<Vertex> getNeighbourList(){
		return neighbourList;
	}

	public void setNeighbourList(List<Vertex> neighbourList){
		this.neighbourList = neighbourList;
	}

	public void addNeighbourVertex(Vertex vertex){
		this.neighbourList.add(vertex);
	}

	public String toString(){
		return ""+this.data;
	}

}

class BFS{
	public void bfs(Vertex root){
		Queue<Vertex> queue = new LinkedList<>();
		root.setVisited(true);
		queue.add(root);
		while(!queue.isEmpty()){
			Vertex actualVertex = queue.remove();
			System.out.println(actualVertex + " ");
			for(Vertex v : actualVertex.getNeighbourList()){
				if(!v.isVisited()){
					v.setVisited(true);
					queue.add(v);	
				}
			}
		}
	}
}