package com.pract;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
	
	static List<List<Integer>> graph= new ArrayList<>();

	public static void main(String[] args) {
		
		
		
		System.out.println("Enter No of Nodes");
		Scanner scan = new Scanner(System.in);
		int nodes= scan.nextInt();
		
		
		System.out.println("Enter No of Edges");
		int edges= scan.nextInt();
		
		createNodes(nodes);
		
		System.out.println("Enter Edges Info");
		for(int i=0; i<edges;i++) {
			int x = scan.nextInt();
			int y= scan.nextInt();
			
				addEdge(i,x,y);
			
		}
		

		System.out.println(graph);
		
		System.out.println("Enter source and Desitantion");
		int src = scan.nextInt();
		int dest = scan.nextInt();
			doBfsOnThis(src,dest,nodes);
	}

	private static void doBfsOnThis(int src, int dest, int nodes) {
		
		int parent[] = new int[nodes];
		boolean[] visited = new boolean[nodes];
		Queue<Integer> que = new LinkedList<>();
		
		parent[src]=-1;
		visited[src]=true;
		que.add(src);
		int step=0;
		
		while(!que.isEmpty()) {
			
			int curent = que.poll();
			
			System.out.print(curent);
			
			if(curent==dest) {
				
				System.out.println("PathFound");
				break;
			}
			
			for(int edg: graph.get(curent)) {
				if(!visited[edg]) {
					que.add(edg);
					visited[edg]=true;
					parent[edg]=curent;
					
				}
			}
			
			
			
			
		}
		
		System.out.println(" parent array");
		for(int k :parent) {
			System.out.print(k+" ");
		}
		
		int distance=0;
		int current=dest;
		
		while(parent[current]!=-1||current==src) {
			
			System.out.print(current+" -->");
			
			if(current==src)
				break;
			
			current=parent[current];
			distance++;
		}
		
	}

	private static void addEdge(int i, int x, int y) {
		
		graph.get(x).add(y);
		graph.get(y).add(x);
	}

	private static void createNodes(int nodes) {
		
		for(int i=0; i<nodes ;i++) {
			graph.add(new ArrayList<>()); 
		}
		
		
		
	}
}
