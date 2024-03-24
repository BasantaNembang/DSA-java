package Graph;
import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.PriorityQueue;
public class MST {
    public static class edge {
    int src;
    int dist;
    int wtd;
    public edge(int s, int d, int w){
        this.src=s;
        this.dist=d;
        this.wtd=w;
    }
    }

    public static void garphMake(ArrayList<edge> garph[], int v){
      for(int i=0; i<garph.length; i++){
        garph[i]=new ArrayList<>();
      }

      garph[0].add(new edge(0, 3, 30));
      garph[0].add(new edge(0, 1, 10));
      garph[0].add(new edge(0, 2, 15));

      garph[1].add(new edge(1, 0, 10));
      garph[1].add(new edge(1, 3, 40));

      garph[2].add(new edge(2, 0, 15));
      garph[2].add(new edge(2, 3, 50));
      
      garph[3].add(new edge(3, 1, 40));
      garph[3].add(new edge(3, 2, 50));
    }
    //Prims Alorithm
public static class Pair implements Comparable <Pair>{
    int node;
    int cost;
    
    Pair(int n, int c){
       this.node=n;
       this.cost=c;
    }

    @Override
    public int compareTo(Pair p1){
        return this.cost-p1.cost;
    }
       
   }
   //find the MST distance
   public static void primsAlorithm( ArrayList<edge> garph[], int v){
       PriorityQueue<Pair> pQ=new PriorityQueue<>();
       boolean check[]=new boolean[v];
       pQ.add(new Pair(0, 0));
       int cost=0;
       int parent[]=new int[v]; //to store all the cost edge

       while (!pQ.isEmpty()) {
          Pair curr=pQ.remove();
           
          if(!check[curr.node]){
             check[curr.node]=true;
            parent[curr.node]=curr.cost;
              cost+=curr.cost;
                        
          for(int i=0; i<garph[curr.node].size(); i++){
                edge f=garph[curr.node].get(i);

                if(!check[f.dist]){
                   pQ.add(new Pair(f.dist, f.wtd));               
               }
             }
          }
       }
       System.out.println("Total MST  " + cost);
       System.out.println();
      for(int i=0; i<v; i++){
        System.out.print(parent[i]+" " ); }  
    }
   
       public static void main(String[] args) {
        /*
              0
            / |\
     10   /   |  \  15
        1   30|   2
          \   |  /
     40    \ 3 /   50
         */
    int v=4;  
    ArrayList<edge> garph[]=new ArrayList[v];
    garphMake(garph, v);
    primsAlorithm(garph, v);  
    }
}



 