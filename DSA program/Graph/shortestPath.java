package Graph;
import java.util.ArrayList;
import java.util.PriorityQueue;
public class shortestPath {
    public static class edge{
        int src;
        int dst;
        int wtd;
        edge(int s, int d, int w){
            this.src=s;
            this.dst=d;
            this.wtd=w;
        }
    }
    //create graph
     public static void makeGraph(ArrayList<edge> graph[]){
      for(int i=0; i<graph.length; i++){
          graph[i]=new ArrayList<>();
      }
      graph[0].add(new edge(0, 1, 2));
      graph[0].add(new edge(0, 2, 4));

      graph[1].add(new edge(1, 2, 1));
      graph[1].add(new edge(1, 3, 7));

      graph[2].add(new edge(2, 4, 3));

      graph[3].add(new edge(3, 5, 1));

      graph[4].add(new edge(4, 5, 5));
      graph[4].add(new edge(4, 3, 2));

     }
   
     public static class Pair implements Comparable <Pair>{
        int node;
        int dist;
        public Pair(int n, int d){
            this.node=n;
            this.dist=d;
        }
        @Override     
       public int compareTo(Pair p1){
          return this.dist-p1.dist;   //assending order
       }
     }
    
     //algorithm
     public static void dijkAlorithm(ArrayList<edge> graph[], int v, int from){
       PriorityQueue<Pair> qP=new PriorityQueue<>();
       int dist[]=new int[v];
           for(int i=0; i<v; i++){
            if(i==from){
                dist[i]=0;
             }else{
                dist[i]=Integer.MAX_VALUE;
             }
           }
       boolean check[]=new boolean[v];
       qP.add(new Pair(from, 0));
             
       while (!qP.isEmpty()) {
        Pair curr=qP.remove();
          
        if(check[curr.node]==false){
            check[curr.node]=true;

            for(int i=0; i<graph[curr.node].size(); i++){
                 edge fst=graph[curr.node].get(i);
                 int B=fst.src;
                 int N=fst.dst;

                 if(dist[B]+fst.wtd<dist[N]){
                    dist[N]=dist[B]+fst.wtd;
                    qP.add(new Pair(N, dist[N]));
                 }
                
            }
        }
        
       }
       for(int i=0; i<v; i++){
        System.out.print(dist[i]+" ");
       }
       System.out.println();
       


     }
    
    public static void main(String[] args) {
        /*      7
           /->1------>3
       2  /   |      to \ 1
        0    1|     2|   \to 5 
       4 \    to     |  / 5
          \>2  ----->4
               3
         */
    int v=6;
    int sourceNode=0;
    ArrayList<edge> graph[]=new ArrayList[v];
    makeGraph(graph);
    dijkAlorithm(graph, v, sourceNode);
    
    }

    
}
 