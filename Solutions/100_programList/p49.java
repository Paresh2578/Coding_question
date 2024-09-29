import java.util.ArrayList;
import java.util.List;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class p48{
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5 , 6};
     
        List<List<Node>> graph = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Node(1));
        graph.get(0).add(new Node(2));
        graph.get(1).add(new Node(3));
        graph.get(2).add(new Node(4));
        graph.get(3).add(new Node(5));
        graph.get(3).add(new Node(4));
        graph.get(4).add(new Node(5));
        graph.get(5).add(new Node(6));
        

        boolean[] visited = new boolean[arr.length];

        dfs(arr , visited , graph , 0);
    }

    public static void dfs(int[] arr , boolean[] visited , List<List<Node>> graph , int current){
        visited[current] = true;
        System.out.println(current);

        for(Node node : graph.get(current)){
            if(!visited[node.data]){
                dfs(arr, visited, graph, node.data);
            }
        }
    }
}