package easy;

import java.util.Stack;

public class DFS {
	public static void dfs(int start,boolean[] visited,int[][] data){
		int length = data[start].length;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(start);
		visited[start] = true;
		
		boolean is_push = false;
		while(!stack.isEmpty()){
			is_push = false;
			Integer s = stack.peek();
			for(int i = 0; i < length;i ++ ){
				if(!visited[i] && data[s][i] == 1){
					visited[i] = true;
					stack.push(i);
					System.out.println("push: "+i);
					is_push = true;	
					break;
				}
			}
		if(!is_push){
			System.out.println("pop: "+stack.pop());
		}
		}
	}
	
	public static void dfs2(int start,boolean[] visited,int[][] data){
		visited[start] = true;
		for(int i = 0; i < data[start].length; i ++){
			if(!visited[i] && data[start][i] == 1){
				dfs2(i,visited,data);
			}
		}
		System.out.println("pop: "+start);
	}
	
	public static void main(String[] args) {
		int N = 5;
		int[][] maze= {
			    { 0, 1, 1, 0, 0 },
			    { 0, 0, 1, 0, 1 },
			    { 0, 0, 1, 0, 0 },
			    { 1, 1, 0, 0, 1 },
			    { 0, 0, 1, 0, 0 }
			};
		boolean[] visited = new boolean[N];
		for(int i = 0; i < N; i ++){
			if(visited[i] == true) continue;
			dfs2(i,visited,maze);
		}
	}
}
